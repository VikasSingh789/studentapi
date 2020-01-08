
 app.service(
        'employeeservice',function($http) {
           
           return{
        	   		addEmployee : function(employee1) {
                    return $http({
                        method : 'POST',
                        url : '/SpringHbApp/employeemodule/addEmployee',
                        data : employee1
                        });
                  
                   },
                   
                   getAllEmployee: function() {
                       return $http({
                           method: 'GET',
                           url: '/SpringHbApp/employeemodule/getAllEmployee'
                       });
                   },
                   
                   remove:function(EmployeeId){
                	   return $http({
                		   method:'delete',
                		   url:'/SpringHbApp/employeemodule/deleteEmployee',
                		   params:{
                			   eid:EmployeeId
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