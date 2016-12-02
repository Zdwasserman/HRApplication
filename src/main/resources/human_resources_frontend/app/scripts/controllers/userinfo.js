angular.module('humanResourcesFrontendApp')
  .controller('UserinfoCtrl', function ($http, $scope) {

    var onEmployee = function(response)
    {
      $scope.employee=response.data;
    }

    $scope.getEmployeeInfo=function()
    {
      $http.get("http://localhost:8080/findID?empID=" + $scope.employeeID)
      .then(onEmployee)
    }
  });
