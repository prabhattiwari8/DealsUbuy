'use strict';
angular
.module('myApp')
App.controller('registerController', ['$scope', 'registerService', function($scope, registerService) {
          var self = this;
          self.country={id:null,countryName:''};
          self.countries=[];
               
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
          }]);


