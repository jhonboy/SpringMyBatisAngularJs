//Define a function scope, variables used inside it will NOT be globally visible.
(function () {

    var
    //the HTTP headers to be used by all requests
        httpHeaders,

    //the message to be shown to the user
        message,

    //Define the main module.
    //The module is accessible everywhere using "angular.module('angularspring')", therefore global variables can be avoided totally.
        as = angular.module('yambas',['ui.bootstrap','ngCookies']);

    as.config(function ($routeProvider, $httpProvider,$locationProvider) {
        //configure the rounting of ng-view
        $routeProvider.when('/person', { controller: 'PersonController', templateUrl: 'partials/person.html'});
        $routeProvider.when('/login', { controller: 'LoginController', templateUrl: 'partials/login.html'});
        $routeProvider.when('/admin', { controller: 'AdminController', templateUrl: 'admin/admin.html'});
        $routeProvider.when('/post', { controller: 'PostController', templateUrl: 'partials/post.html'});
        $routeProvider.when('/news', { controller: 'NewsController', templateUrl: 'partials/news.html'});
        $routeProvider.when('/news/:idNews', {controller: 'NewsDetail' , templateUrl: 'partials/newsDetail.jsp'});
        $routeProvider.when('/userDetail/:username', {controller: 'UserDetailController' , templateUrl: 'partials/userDetails.jsp'});
        $routeProvider.when('/sess', { controller: 'SessionController', templateUrl: 'sess.jsp'});
        $routeProvider.when('/family', { controller: 'FamilyController', templateUrl: 'partials/family.jsp'});
        $routeProvider.when('/signup',{controller:'SignUpController',templateUrl:'partials/signup.html'});
        $routeProvider.when('/profil/:username',{controller:'ProfilController',templateUrl:'partials/profilEdit.jsp'});
        $routeProvider.when('/',{controller:'MainController',templateUrl:'partials/home.jsp'});
 // $locationProvider.html5Mode(true);
        //configure $http to catch message responses and show them
        $httpProvider.responseInterceptors.push(function ($q) {
            var setMessage = function (response) {
                //if the response has a text and a type property, it is a message to be shown
                if (response.data.text && response.data.type) {
                    message = {
                        text: response.data.text,
                        type: response.data.type,
                        show: true
                    };
                }
            };
            return function (promise) {
                return promise.then(
                    //this is called after each successful server request
                    function (response) {
                        setMessage(response);
                        return response;
                    },
                    //this is called after each unsuccessful server request
                    function (response) {
                        setMessage(response);
                        return $q.reject(response);
                    }
                );
            };
        });

        //configure $http to show a login dialog whenever a 401 unauthorized response arrives
        $httpProvider.responseInterceptors.push(function ($rootScope, $q) {
            return function (promise) {
                return promise.then(
                    //success -> don't intercept
                    function (response) {
                        return response;
                    },
                    //error -> if 401 save the request and broadcast an event
                    function (response) {
                        if (response.status === 401) {
                            var deferred = $q.defer(),
                                req = {
                                    config: response.config,
                                    deferred: deferred
                                };
                            $rootScope.requests401.push(req);
                            $rootScope.$broadcast('event:loginRequired');
                            return deferred.promise;
                        }
                        return $q.reject(response);
                    }
                );
            };
        });
        httpHeaders = $httpProvider.defaults.headers;
    });


    as.run(function ($rootScope, $http, base64,$location) {
        //make current message accessible to root scope and therefore all scopes
        $rootScope.message = function () {
            return message;
        };

        /**
         * Holds all the requests which failed due to 401 response.
         */
        $rootScope.requests401 = [];

        $rootScope.$on('event:loginRequired', function () {
            $location.url('/login');
        });

        /**
         * On 'event:loginConfirmed', resend all the 401 requests.
         */
        $rootScope.$on('event:loginConfirmed', function () {
            var i,
                requests = $rootScope.requests401,
                retry = function (req) {
                    $http(req.config).then(function (response) {
                        req.deferred.resolve(response);
                    });
                };

            for (i = 0; i < requests.length; i += 1) {
                retry(requests[i]);
            }
            $rootScope.requests401 = [];
            
        });

        /**
         * On 'event:loginRequest' send credentials to the server.
         */
        $rootScope.$on('event:loginRequest', function (event, username, password) {
            httpHeaders.common['Authorization'] = 'Basic ' + base64.encode(username + ':' + password);
            $http.get('action/user').success(function (data) {
                $rootScope.user = data;   
                $rootScope.$broadcast('event:loginConfirmed');
		location.reload();
                $location.url('/');
            });
        });

        /**
         * On 'logoutRequest' invoke logout on the server and broadcast 'event:loginRequired'.
         */
        $rootScope.$on('event:logoutRequest', function () {
            httpHeaders.common['Authorization'] = null;
        });
    });

}());