(function () {
    var as = angular.module('yambas');

    as.service('i18n', function () {
        var self = this;
        this.setLanguage = function (language) {
            $.i18n.properties({
                name: 'messages',
                path: 'i18n/',
                mode: 'map',
                language: language,
                callback: function () {
                    self.language = language;
                }
            });
        };
        this.setLanguage('in');
    });

    as.directive('msg', function () {
        return {
            restrict: 'EA',
            link: function (scope, element, attrs) {
                var key = attrs.key;
                if (attrs.keyExpr) {
                    scope.$watch(attrs.keyExpr, function (value) {
                        key = value;
                        element.text($.i18n.prop(value));
                    });
                }
                scope.$watch('language()', function (value) {
                    element.text($.i18n.prop(key));
                });
            }
        };
    });
}());