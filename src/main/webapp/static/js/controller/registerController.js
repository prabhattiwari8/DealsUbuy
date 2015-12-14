'use strict';
angular
.module('myApp')
App.controller('registerController', ['$scope', 'registerService', function($scope, registerService) {
          var self = this;
          self.country={id:null,countryName:''};
          self.countries=[];
          self.states=[];
          self.cities=[];
 			self.user = {    };
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
          self.fetchAllStates = function(){
              registerService.fetchAllStates()
                  .then(
                               function(d) {
                                    self.states = d;
                                    console.log(self.states);
                               },
                                function(errResponse){
                                    console.error('Error while fetching states');
                                }
                       );
          };
          self.fetchAllCities = function(){
              registerService.fetchAllCities()
                  .then(
                               function(d) {
                                    self.cities = d;
                                    console.log(self.cities);
                               },
                                function(errResponse){
                                    console.error('Error while fetching cities');
                                }
                       );
          };
          self.fetchAllCountries();
          self.fetchAllStates();
          self.fetchAllCities();
             $scope.submitForm = function(isValid) {

		  		      // check to make sure the form is completely valid
				  		      $scope.submitted = true;

				if (isValid) {
					var userJSON = angular.toJson($scope.self);
					console.log('Data:', userJSON);
					registerService.saveUser(userJSON).then(
                            function(d) {
                                
                                console.log("save successfull");
                           },
                            function(errResponse){
                                console.error('Error while saving user');
                            }
                   );
				}

		    };
          }]);


