'use strict';
 
var App = angular.module('myApp',['ngRoute'])
          .config(config);

config.$inject = ['$routeProvider', '$locationProvider'];

function config($routeProvider, $locationProvider) {
    $routeProvider
        .when('/login', {
            controller: 'loginController',
            templateUrl: './static/html/Login.html',
            controllerAs: 'ctrl'
        })
        .when('/', {
            controller: 'registerController',
            templateUrl: './static/html/Register.html',
            controllerAs: 'ctrl'
        })

        .otherwise({ redirectTo: '/' });
    }

