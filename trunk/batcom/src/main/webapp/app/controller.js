

(function(angular) {
  'use strict';
  
angular.module('yambas')
.controller('MainController',['$scope','$http','$location', function ($scope, $http, $location) {   
       
        $scope.login = function () {
           
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
.controller('LoginController',
    ['$scope', '$rootScope', '$location', 'AuthenticationService',
    function ($scope, $rootScope, $location, AuthenticationService) {
        // reset login status
        AuthenticationService.ClearCredentials();
  
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
    
.controller('NewsController',['$scope','$http', function ($scope, $http) {
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

