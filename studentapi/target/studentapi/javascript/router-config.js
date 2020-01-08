
 var app=angular.module('emp', ['ngRoute']);
 
 app.config(function($routeProvider){
    $routeProvider
     .when('/add',{
        templateUrl:'views/employee/addemployee.html',
        controller:'EmpController'
       })
       .when('/show',{
    	   templateUrl:'views/employee/welcome.html',
    	   controller:'EmpController'
       })
       .when('/home',{
    	   templateUrl:'views/employee/home.html',
    	   controller:'EmpController'
       })
       .when('/edit',{
    	   templateUrl:'views/employee/edit.html',
    	   controller:'EmpController'
       }).when('/sqlToJson',{
    	   templateUrl:'views/queryJson/queryToJson.html',
    	   controller:'EmpController'
       })
       .when('/itdeclaration/addSection',{
        templateUrl:'views/itdeclaration/addSection.html',
        controller:'ITDeclarationController'
       })
       .when('/itdeclaration/sections',{
    	   templateUrl:'views/itdeclaration/sections.html',
    	   controller:'ITDeclarationController'
       })
       .when('/itdeclaration/addInvestment',{
    	   templateUrl:'views/itdeclaration/addInvestment.html',
    	   controller:'ITDeclarationController'
       })
       .when('/itdeclaration/editSection',{
    	   templateUrl:'views/itdeclaration/editSection.html',
    	   controller:'ITDeclarationController'
       }).when('/itdeclaration/editInvestment',{
    	   templateUrl:'views/itdeclaration/editInvestment.html',
    	   controller:'ITDeclarationController'
       })
    .otherwise({
    	redirectTo:'/home'
    });
});
   