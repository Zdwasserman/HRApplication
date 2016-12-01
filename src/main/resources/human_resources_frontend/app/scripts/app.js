'use strict';

/**
 * @ngdoc overview
 * @name humanResourcesFrontendApp
 * @description
 * # humanResourcesFrontendApp
 *
 * Main module of the application.
 */
angular
  .module('humanResourcesFrontendApp', [
    'ngAnimate',
    'ngAria',
    'ngCookies',
    'ngMessages',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
      .when('/submit', {
        templateUrl: 'views/submit.html',
        controller: 'SubmitCtrl',
        controllerAs: 'submit'
      })
      .when('/userinfo', {
        templateUrl: 'views/userinfo.html',
        controller: 'UserinfoCtrl',
        controllerAs: 'userinfo'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
