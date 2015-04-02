////Define a function scope, variables used inside it will NOT be globally visible.
//(function () {
//
//    var
//    //the HTTP headers to be used by all requests
//        httpHeaders,
//
//    //the message to be shown to the user
//        message,
//
//    //Define the main module.
//    //The module is accessible everywhere using "angular.module('angularspring')", therefore global variables can be avoided totally.
//        as = angular.module('yambas',['ui.bootstrap','ngCookies']);
//
//    as.config(function ($routeProvider, $httpProvider,$locationProvider) {
//        //configure the rounting of ng-view
//        $routeProvider.when('/person', { controller: 'PersonController', templateUrl: 'partials/person.html'});
//        $routeProvider.when('/login', { controller: 'LoginController', templateUrl: 'partials/login.html'});
//        $routeProvider.when('/admin', { controller: 'AdminController', templateUrl: 'admin/admin.html'});
//        $routeProvider.when('/post', { controller: 'PostController', templateUrl: 'partials/post.html'});
//        $routeProvider.when('/news', { controller: 'NewsController', templateUrl: 'partials/news.html'});
//        $routeProvider.when('/news/:idNews', {controller: 'NewsDetail' , templateUrl: 'partials/newsDetail.jsp'});
//        $routeProvider.when('/userDetail/:username', {controller: 'UserDetailController' , templateUrl: 'partials/userDetails.jsp'});
//        $routeProvider.when('/sess', { controller: 'SessionController', templateUrl: 'sess.jsp'});
//        $routeProvider.when('/family', { controller: 'FamilyController', templateUrl: 'partials/family.jsp'});
//        $routeProvider.when('/signup',{controller:'SignUpController',templateUrl:'partials/signup.html'});
//        $routeProvider.when('/profil/:username',{controller:'ProfilController',templateUrl:'partials/profilEdit.jsp'});
//        $routeProvider.when('/',{controller:'MainController',templateUrl:'partials/home.jsp'});
// // $locationProvider.html5Mode(true);
//        //configure $http to catch message responses and show them
//        $httpProvider.responseInterceptors.push(function ($q) {
//            var setMessage = function (response) {
//                //if the response has a text and a type property, it is a message to be shown
//                if (response.data.text && response.data.type) {
//                    message = {
//                        text: response.data.text,
//                        type: response.data.type,
//                        show: true
//                    };
//                }
//            };
//            return function (promise) {
//                return promise.then(
//                    //this is called after each successful server request
//                    function (response) {
//                        setMessage(response);
//                        return response;
//                    },
//                    //this is called after each unsuccessful server request
//                    function (response) {
//                        setMessage(response);
//                        return $q.reject(response);
//                    }
//                );
//            };
//        });
//
//        //configure $http to show a login dialog whenever a 401 unauthorized response arrives
//        $httpProvider.responseInterceptors.push(function ($rootScope, $q) {
//            return function (promise) {
//                return promise.then(
//                    //success -> don't intercept
//                    function (response) {
//                        return response;
//                    },
//                    //error -> if 401 save the request and broadcast an event
//                    function (response) {
//                        if (response.status === 401) {
//                            var deferred = $q.defer(),
//                                req = {
//                                    config: response.config,
//                                    deferred: deferred
//                                };
//                            $rootScope.requests401.push(req);
//                            $rootScope.$broadcast('event:loginRequired');
//                            return deferred.promise;
//                        }
//                        return $q.reject(response);
//                    }
//                );
//            };
//        });
//        httpHeaders = $httpProvider.defaults.headers;
//    });
//
//
//    as.run(function ($rootScope, $http, base64,$location) {
//        //make current message accessible to root scope and therefore all scopes
//        $rootScope.message = function () {
//            return message;
//        };
//
//        /**
//         * Holds all the requests which failed due to 401 response.
//         */
//        $rootScope.requests401 = [];
//
//        $rootScope.$on('event:loginRequired', function () {
//            $location.url('/login');
//        });
//
//        /**
//         * On 'event:loginConfirmed', resend all the 401 requests.
//         */
//        $rootScope.$on('event:loginConfirmed', function () {
//            var i,
//                requests = $rootScope.requests401,
//                retry = function (req) {
//                    $http(req.config).then(function (response) {
//                        req.deferred.resolve(response);
//                    });
//                };
//
//            for (i = 0; i < requests.length; i += 1) {
//                retry(requests[i]);
//            }
//            $rootScope.requests401 = [];
//            
//        });
//
//        /**
//         * On 'event:loginRequest' send credentials to the server.
//         */
//        $rootScope.$on('event:loginRequest', function (event, username, password) {
//            httpHeaders.common['Authorization'] = 'Basic ' + base64.encode(username + ':' + password);
//            $http.get('action/user').success(function (data) {
//                $rootScope.user = data;   
//                $rootScope.$broadcast('event:loginConfirmed');
//		location.reload();
//                $location.url('/');
//            });
//        });
//
//        /**
//         * On 'logoutRequest' invoke logout on the server and broadcast 'event:loginRequired'.
//         */
//        $rootScope.$on('event:logoutRequest', function () {
//            httpHeaders.common['Authorization'] = null;
//        });
//    });
//
//}());


(function(angular) {
  'use strict';
  
angular.module('yambas', ['ngRoute', 'ngAnimate'])
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
        .when('/news/:idNews', {controller: 'NewsDetail' , templateUrl: 'partials/newsDetail.jsp'})
        .when('/userDetail/:username', {controller: 'UserDetailController' , templateUrl: 'partials/userDetails.jsp'})
        .when('/profil/:username',{controller:'ProfilController',templateUrl:'partials/profilEdit.jsp'})
        .when('/signup',{controller:'SignUpController',templateUrl:'partials/signup.html'})
        .when('/person', { controller: 'PersonController', templateUrl: 'partials/person.html'})
        .when('/family', { controller: 'FamilyController', templateUrl: 'partials/family.jsp'})
        .when('/sess', { controller: 'SessionController', templateUrl: 'sess.jsp'})
        .when('/post', { controller: 'PostController', templateUrl: 'partials/post.html'})
        .when('/post', { controller: 'MomentController', templateUrl: 'partials/home.jsp'})
        .when('/',{controller:'MainController',templateUrl:'partials/home.jsp'}); 
 
       $locationProvider.html5Mode(false);
       
      
}])
.controller('FetchController', ['$scope', '$http', '$templateCache',
    function($scope, $http, $templateCache) {
      $scope.method = 'GET';
      $scope.url = 'http-hello.html';

      $scope.fetch = function() {
        $scope.code = null;
        $scope.response = null;

        $http({method: $scope.method, url: $scope.url, cache: $templateCache}).
          success(function(data, status) {
            $scope.status = status;
            $scope.data = data;
          }).
          error(function(data, status) {
            $scope.data = data || "Request failed";
            $scope.status = status;
        });
      };

      $scope.updateModel = function(method, url) {
        $scope.method = method;
        $scope.url = url;
      };
    }])
.controller('MainController',['$scope','$rootScope','$http','$location', function ($scope, $rootScope, $http, i18n, $location) {   
        $scope.language = function () {
            return i18n.language;
        };
        $scope.setLanguage = function (lang) {
            i18n.setLanguage(lang);
        };
        $scope.activeWhen = function (value) {
            return value ? 'active' : '';
        };

        $scope.path = function () {
            return $location.url();
        };

        $scope.login = function () {
            $scope.$emit('event:loginRequest', $scope.username, $scope.password);
            $location.url('/login');
          
        };     
         $scope.logout=function(){
                var actionUrl='action/user/logout/'; 
                $http.get(actionUrl).success(function (data) {
                    location.reload();
                });
				 
         };
         $scope.signup = function () {
            $location.url('/signup');
            $('#login').modal('hide');
        };
    }])
.controller('MainCtrl', ['$route', '$routeParams', '$location',
  function($route, $routeParams, $location) {
    this.$route = $route;
    this.$location = $location;
    this.$routeParams = $routeParams;
}])
.controller('LoginController', ['$scope','$location', function($scope,$location) {
        $scope.login = function () {
            $scope.$emit('event:loginRequest', $scope.username, $scope.password);
        };  
         $scope.signup = function () {
            $location.url('/signup');
        };
}])
.controller('PersonController', ['$scope','$http',function ($scope, $http) {
        var actionUrl = 'action/person/',
            load = function () {
                $http.get(actionUrl).success(function (data) {
                    $scope.persons = data;
                });
            };

        load();

        $scope.delete = function (person) {
            $http.delete(actionUrl + person.id).success(function () {
                load();
            });
        };

        $scope.save = function () {
            $http.post(actionUrl, $scope.person).success(function () {
                load();
            });
        };

        $scope.order = '+firstName';

        $scope.orderBy = function (property) {
            $scope.order = ($scope.order[0] === '+' ? '-' : '+') + property;
        };

        $scope.orderIcon = function (property) {
            return property === $scope.order.substring(1) ? $scope.order[0] === '+' ? 'icon-chevron-up' : 'icon-chevron-down' : '';
        };
    }])
.controller('MomentController',['$scope','$http' ,function ($scope, $http) {
    var actionUrl = 'action/moments/',
        load = function () {
                $http.get(actionUrl).success(function (data) {
                    $scope.moments = data;
                });
            };

        load();
        $scope.addMoment = function () {
                $http.post(actionUrl,$scope.moment).success(function () {
                $scope.photo=$scope.moment.photo;
                load(); 
                $scope.uploadFile();
             });
            
        };
        
        $scope.moment = {};

        $scope.setTitle = function(fileInput) {
                var file=fileInput.value;
                var filename = file.replace(/^.*[\\\/]/, '');
                var photo = filename.substr(0, filename.lastIndexOf('.'));
                $("#title").val(photo);
                $("#title").focus();
                $scope.moment.photo=photo;
        };


        $scope.uploadFile=function (){
            
        var formData=new FormData();
        formData.append("file",file.files[0]);
        $http.post('action/upload/', formData, {
            transformRequest: function(data, headersGetterFunction) {
                return data;
            },
            headers: { 'Content-Type': undefined }
            }).success(function(data, status) {                       
                console.log("Success ... " + status);
            }).error(function(data, status) {
                console.log("Error ... " + status);
            });
            };

}])

.controller('UserDetailController',['$scope','$http','$routeParams', function ($scope, $http, $routeParams) {
        var actionUrl = 'action/userDetail/'+$routeParams.username;
            load = function () {
                $http.get(actionUrl).success(function (data) {
                    
                    $scope.userDetails = data;
                  
                });
            };
        load();
        
 }])
        
.controller('ProfilController',['$scope','$http','$routeParams', function ($scope, $http, $routeParams) {
    var actionUrl = 'action/userDetail/'+$routeParams.username;
        load = function () {
            $http.get(actionUrl).success(function (data) {

                $scope.userDetails = data;

            });
        };
    load();
        
}])
        
.controller('AdminController',['$scope','$http', function ($scope, $http) {
   $http.get('action/user');
}])

.controller('PostController',['$scope','$http','itemService','postService', function ($scope, $http,itemService,postService) {

    var actionUrl = 'action/post/';
        load = function () {
            $http.get(actionUrl).success(function (data) {

                $scope.posts = data;

            });
        };
    load();
    var pagesShown = 1;
    var pageSize = 5;
    $scope.items = itemService.getAll();
    $scope.postings=postService.getWeather();

    $scope.panjang=Object.keys($scope.postings).length;
    $scope.itemsLimit = function() {
        return pageSize * pagesShown;
    };
    $scope.hasMoreItemsToShow = function() {
        return pagesShown < ($scope.items.length / pageSize);
    };
    $scope.showMoreItems = function() {
        pagesShown = pagesShown + 1;         
    };

    $scope.save = function () {
        $http.post(actionUrl, $scope.post).success(function () {
            load();
        });
    };
}])
    
.factory('itemService', function() {
    return {
        getAll : function() {
            var items = [];
            for (var i = 1; i < 100; i++) {
                items.push('Item ' + i);                       
            }
            return items;
        }
    };              
})
    
    
.factory('postService', function ($http, $q) {
        return {
            getWeather: function() {
                // the $http API is based on the deferred/promise APIs exposed by the $q service
                // so it returns a promise for us by default
                return $http.get('action/post/')
                    .then(function(response) {
                        if (typeof response.data === 'object') {
                            return response.data;
                        } else {
                            // invalid response
                            return $q.reject(response.data);
                        }

                    }, function(response) {
                        // something went wrong
                        return $q.reject(response.data);
                    });
            }
        };
    })

.controller('slideCtrl', function ($scope) {
    $scope.myInterval = 5000;
    var slides = $scope.slides = [];
    $scope.addSlide = function() {
      var newWidth = 600 + slides.length + 1;
      slides.push({
        image: 'http://placekitten.com/g/' + newWidth + '/300',
        text: ['More','Extra','Lots of','Surplus'][slides.length % 4] + ' ' +
          ['Cats', 'Kittys', 'Felines', 'Cutes'][slides.length % 4]
      });
    };
    for (var i=0; i<4; i++) {
      $scope.addSlide();
    }
})
    
.controller('NewsController',['$scope','$http', function ($scope, $http, i18n) {
    var actionUrl = 'action/news/',
        load = function () {
            $http.get(actionUrl).success(function (data) {
                $scope.news = data;
            });
        };
    load();
}])

.controller('NewsDetail',['$scope','$http','$routeParams', function ($scope, $http, $routeParams) {
        $scope.search = function() {
            var url = 'action/news/';
            $http.get(url).success(httpSuccess).error(function() {
                alert('Unable to get back informations :( ');
            });
        };
        httpSuccess = function(response) {
            $scope.datas = angular.fromJson(response);
           
            $scope.data = $scope.datas.filter(function(item){
				return item.idNews===$routeParams.idNews; // example with id 1, or routeParams.id
            });
        };


        $scope.search();
      
    
		//$scope.idNews = $routeParams.idNews;
		//$scope.data=serv.getNews().get($scope.idNews);
		//$scope.data=serv.getNews($scope.idNews);
    }])
 
 .controller('commentController',['$scope','$http','$routeParams', function ($scope, $http, $routeParams) {
         var url = 'action/comments/';
         var urlComment = 'action/addcomments/';
		$scope.load = function() {
           
            $http.get(url).success(httpSuccess).error(function() {
                alert('Unable to get back informations :( ');
            });
        };
        httpSuccess = function(response) {
            $scope.datas = angular.fromJson(response);
           
            $scope.data = $scope.datas.filter(function(item){
				return item.idNews===$routeParams.idNews; // example with id 1, or routeParams.id
            });
        };


        $scope.load();
        $scope.idNews=$routeParams.idNews;
        $scope.sendComment = function () {
			$scope.comment.idNews=$routeParams.idNews;
            $http.post(urlComment, $scope.comment).success(function () {
                $scope.load();
            });
        };
            $scope.login=function () {
            $http.get('action/user');
                     
        };
		
		//$scope.idNews = $routeParams.idNews;
		//$scope.data=serv.getNews().get($scope.idNews);
		//$scope.data=serv.getNews($scope.idNews);
    }])
.factory('serv',['$http','$q', function ($http, $q) {
    return {
        getNews: function() {
            // the $http API is based on the deferred/promise APIs exposed by the $q service
            // so it returns a promise for us by default
            return $http.get('action/news/')
                .then(function(response) {
                    if (typeof response.data === 'object') {
                        return response.data;
                    } else {
                        // invalid response
                        return $q.reject(response.data);
                    }

                }, function(response) {
                    // something went wrong
                    return $q.reject(response.data);
                });
        }
    };
}])
        
        
 .factory('newsService',['$http','$q', function ($http, $q) {
    return {
        getComment: function() {
            // the $http API is based on the deferred/promise APIs exposed by the $q service
            // so it returns a promise for us by default
            return $http.get('action/news/')
                .then(function(response) {
                    if (typeof response.data === 'object') {
                        return response.data;
                    } else {
                        // invalid response
                        return $q.reject(response.data);
                    }

                }, function(response) {
                    // something went wrong
                    return $q.reject(response.data);
                });
        }
    };
}])

.factory('commentService',['$http','$q', function ($http, $q) {
   return {
       getComment: function() {
           // the $http API is based on the deferred/promise APIs exposed by the $q service
           // so it returns a promise for us by default
           return $http.get('action/comments/')
               .then(function(response) {
                   if (typeof response.data === 'object') {
                       return response.data;
                   } else {
                       // invalid response
                       return $q.reject(response.data);
                   }

               }, function(response) {
                   // something went wrong
                   return $q.reject(response.data);
               });
       }
   };
}])
        
.controller('SessionController',['$http','$http','$cookieStore', function ($scope, $http,$cookieStore) {
   $scope.sess=$cookieStore.get("JSESSIONID");
}])
.controller('FamilyController',['$http','$http', function ($scope, $http) {

}])
    
.controller('SignUpController',['$http','$http', function ($scope, $http) {
    var actionUrl='action/signup/';
    $scope.processSignUp = function () {
        $http.post(actionUrl, $scope.user).success(function () {

        });
    };
 }])
.controller('ChapterCtrl', ['$routeParams', function($routeParams) {
  this.name = "ChapterCtrl";
  this.params = $routeParams;
}]);

})(window.angular);

