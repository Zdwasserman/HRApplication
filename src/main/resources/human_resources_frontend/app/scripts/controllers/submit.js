'use strict';

/**
 * @ngdoc function
 * @name humanResourcesFrontendApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the humanResourcesFrontendApp
 */
angular.module('humanResourcesFrontendApp')
  .controller('SubmitCtrl', function ($scope, $http) {

    function timecard(empID, hours, sales)
    {
      this.employeeID = empID;
      this.hours = hours;
      this.sales = sales;
    }

    $scope.submitTimeCard = function() {
      var timeCardToPost = new timecard($scope.empID, $scope.hours, $scope.sales);
      $http({
              method:'POST',
              url: 'http://localhost:9000/timecards',
              data: timeCardToPost,
              // console.log(timeCardToPost);
            })
        }
  });
