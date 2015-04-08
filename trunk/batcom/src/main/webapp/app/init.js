

(function(angular) {
  'use strict';
 var message,httpHeaders, as= 
angular.module('yambas', ['ngRoute', 'ngAnimate','ngCookies'])
.config(['$routeProvider', '$locationProvider','$httpProvider',
    function($routeProvider, $locationProvider,$httpProvider) {
      $routeProvider
        .when('/login', {
          templateUrl: 'partials/login.html',
          controller: 'LoginController',
          controllerAs: 'LoginController'
        })
        .when('/admin', {
          templateUrl: 'admin/admin.html',
          controller: 'AdminController',
          controllerAs: 'AdminController'
        })
        .when('/news', { 
          controller: 'NewsController', 
          templateUrl: 'partials/news.html'
        })
        .when('/news/:idNews', {
            controller: 'NewsDetail' , 
            templateUrl: 'partials/newsDetail.jsp'
        })
        .when('/userDetail/:username', {
            controller: 'UserDetailController' , 
            templateUrl: 'partials/userDetails.jsp'
        })
        .when('/profil/:username',{
            controller:'ProfilController',
            templateUrl:'partials/profilEdit.jsp'
        })
        .when('/signup',{
            controller:'SignUpController',
            templateUrl:'partials/signup.html'
        })
        .when('/person', { 
            controller: 'PersonController', 
            templateUrl: 'partials/person.html'
        })
        .when('/family', { 
            controller: 'FamilyController', 
            templateUrl: 'partials/family.jsp'
        })
        .when('/sess', { 
            controller: 'SessionController', 
            templateUrl: 'sess.jsp'
        })
        .when('/post', { 
            controller: 'PostController', 
            templateUrl: 'partials/post.html'
        })
        .when('/post', { 
            controller: 'MomentController', 
            templateUrl: 'partials/home.jsp'
        })
        .when('/',{
            controller:'MainController',
            templateUrl:'partials/home.jsp'
        }); 
 
       $locationProvider.html5Mode(false);
   //configure $http to catch message responses and show them
   
      $httpProvider.interceptors.push('errorInterceptor');   
      httpHeaders = $httpProvider.defaults.headers;
     
    }])

    .run(function ($rootScope, $http,$location, base64) {
        //make current message accessible to root scope and therefore all scopes
        $rootScope.message = function () {
            return message;
        };

        /**
         * Holds all the requests which failed due to 401 response.
         */
        $rootScope.requests401 = [];

        $rootScope.$on('event:loginRequired', function () {
            $('#login').modal('show');
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
            $location.url("/person");
        });

        /**
         * On 'event:loginRequest' send credentials to the server.
         */
        $rootScope.$on('event:loginRequest', function (event, username, password) {
            httpHeaders.common['Authorization'] = 'Basic ' + base64.encode(username + ':' + password);
            $http.get('action/user').success(function (data) {
                $rootScope.user = data;
                $rootScope.$broadcast('event:loginConfirmed');
            });
        });

        /**
         * On 'logoutRequest' invoke logout on the server and broadcast 'event:loginRequired'.
         */
        $rootScope.$on('event:logoutRequest', function () {
            httpHeaders.common['Authorization'] = null;
        });
    });
})(window.angular);

