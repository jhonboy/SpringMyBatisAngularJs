

(function(angular) {
  'use strict';
  
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
       
      
}])
.run(['$rootScope', '$location', '$cookieStore', '$http',
    function ($rootScope, $location, $cookieStore, $http) {
        // keep user logged in after page refresh
        $rootScope.globals = $cookieStore.get('globals') || {};
        if ($rootScope.globals.currentUser) {
            $http.defaults.headers.common['Authorization'] = 'Basic ' + $rootScope.globals.currentUser.authdata; // jshint ignore:line
        }
  
        $rootScope.$on('$locationChangeStart', function (event, next, current) {
            // redirect to login page if not logged in
            if ($location.path() !== '/login' && !$rootScope.globals.currentUser) {
                $location.path('/login');
            }
        });
    }]);
})(window.angular);

