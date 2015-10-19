'use strict';
angular
.module('myApp')
App.controller('registerController', ['$scope', 'registerService', function($scope, registerService) {
          var self = this;
          self.country={id:null,countryName:''};
          self.countries=[];
 			self.user = {
  					    email: "",
   						password: "",
   						confirmPassword: ""
    };
          self.fetchAllCountries = function(){
              registerService.fetchAllCountries()
                  .then(
                               function(d) {
                                    self.countries = d;
                                    console.log(self.countries);
                               },
                                function(errResponse){
                                    console.error('Error while fetching Countries');
                                }
                       );
          };
          self.fetchAllCountries();
             $scope.submitForm = function(isValid) {

		  		      // check to make sure the form is completely valid
		  		        $scope.submitted = true;
		  		      alert($scope.submitted);
		  		      if (isValid) {
		  		        alert('our form is amazing');
		  		      }

		    };
          }]);


