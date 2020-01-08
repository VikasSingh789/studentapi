
 app.service(
        'employeeservice',function($http) {
           
           return{
        	   		addEmployee : function(employee1) {
                    return $http({
                        method : 'POST',
                        url : '/studentapi/api/saveStudent',
                        data : employee1
                        });
                  
                   },
                   
                   getAllEmployee: function() {
                       return $http({
                           method: 'GET',
                           url: '/studentapi/api/students'
                       });
                   },
                   
                   remove:function(EmployeeId){
                	   return $http({
                		   method:'delete',
                		   url:'/studentapi/api/deleteStudent',
                		   params:{
                			   sid:EmployeeId
                		   }
                	   });
                   },
                   
                   updateEmployee: function(EmployeeId) {
                       return $http({
                           method: 'POST',
                           url:'/SpringHbApp/employeemodule/editEmployee',
                           data: EmployeeId
                       });
                   },
           
        };
        });