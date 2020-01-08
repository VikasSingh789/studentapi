/*var app=angular.module('emp',[]);*/
app.controller('EmpController', function($scope,$location,employeeservice) {

	
	
	/*$scope.hello= "88888888888888888888866666666666666OOOOO";*/
	//$scope.employee = {};
	$scope.insert=function(use){
		
		$location.path('add');
	};
	
	$scope.editEmployeeFlagList=true;

	$scope.addEmployee = function(employee) {
		
		
		employeeservice
        .isEmployeeEmailExist(employee.email)
        .success(
            function(response) {
                if (response === true) {
                	alert("mail is alredy exist");  
                }
                else{
                	employeeservice.addEmployee(employee).success(function(){
                 	   
                 	   $location.path('home');
                 	 
                    });
                }
            });
       	 
	};
	
	
        employeeservice.getAllEmployee().success(function(data) {
            $scope.employ = data;
        });
   
       $scope.remove=function(eid)
       {
    	   employeeservice.remove(eid).then(function(){
    	
    		   employeeservice.getAllEmployee().success(function(data) {
    	            $scope.employ = data;
    		   });
    	   });
       };
       
       $scope.editEmployee=function(employee)
       {
    	   $scope.editEmployeeFlagList = false;
    	   $scope.employee=employee;
       };
       
       $scope.saveEmployee=function(employee){
       employeeservice.updateEmployee(employee).success(function()
    		   {
    	   $scope.editEmployeeFlagList = true;
    	   $scope.employee=employee;
    		   });
       };
       
       $scope.backEmployee=function(){
    	   $scope.editEmployeeFlagList = true;
       };
       
       $scope.backEmployeeList=function(){
    	   $location.path('home');
       };
       
       $scope.queryJson = function(){
    	   employeeservice.queryJson().success(function(response)
        		   {
    		   $scope.json = response;
        		   });
       }
      
       
});