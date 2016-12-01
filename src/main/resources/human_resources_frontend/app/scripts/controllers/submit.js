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
      this.numHours = hours;
      this.widgetSales = sales;
      console.log("HELLO TIMECARD");
    }

    $scope.submitTimeCard = function() {
      var timeCardToPost = new timecard($scope.employeeID, $scope.hours, $scope.sales);
      $http({
              method:'POST',
              url: 'http://localhost:8080/timecards',
              data: timeCardToPost
              // console.log(timeCardToPost);
            })
            .then(function(response)
            {
              console.log(response.data);
            });
            console.log("success");
            console.log(timeCardToPost.employeeID);
            console.log(timeCardToPost.numHours);
            console.log(timeCardToPost.widgetSales);
        }
  });
