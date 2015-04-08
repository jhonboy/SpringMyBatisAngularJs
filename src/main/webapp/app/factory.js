

(function(angular) {
  'use strict';
  
angular.module('yambas')



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
       
 .factory('errorInterceptor', ['$q', '$rootScope', 'MessageService', '$location',
    function ($q, $rootScope, MessageService, $location) {
        return {
            request: function (config) {
                return config || $q.when(config);
            },
            requestError: function(request){
                return $q.reject(request);
            },
            response: function (response) {
                return response || $q.when(response);
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
            },
            responseError: function (response) {
                if (response && response.status === 404) {
                    MessageService.setError('Page not found');
                }
                if (response && response.status >= 500) {
                    MessageService.setError('Error 500');
                }
                return $q.reject(response);
            }
        };
         
}])
.service('MessageService', function () {
    // angular strap alert directive supports multiple alerts. 
    // Usually this is a distraction to user. 
    //Let us limit the messages to one    
    this.messages = [];
    this.setError = function(msg) {
        this.setMessage(msg, 'error', 'Error:');
    };
    this.setSuccess = function(msg) {
        this.setMessage(msg, 'success', 'Success:');
    };
    this.setInfo = function (msg) {
        this.setMessage(msg, 'info', 'Info:');
    };    
    this.setMessage = function(text, type, show) {
        message = {
            text: response.data.text,
            type: response.data.type,
            show: true
        };
        this.messages[0] = message;
    };
    this.clear = function() {
        this.messages = [];
    };
});
})(window.angular);

