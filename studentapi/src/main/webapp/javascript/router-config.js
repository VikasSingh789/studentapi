
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
       })
    .otherwise({
    	redirectTo:'/home'
    });
});
   