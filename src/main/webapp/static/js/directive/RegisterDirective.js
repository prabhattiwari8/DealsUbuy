'use strict';
angular
.module('myApp')
App.directive('compareTo',function() {

    return {

       require: "ngModel",

        scope: {

          otherModelValue: "=compareTo"
        },
        link: function(scope, element, attributes,ngModel) {
      	 
      	  ngModel.$validators.compareTo = function(modelValue) {
		

		  		  return modelValue == scope.otherModelValue;
		};



        }
      };
    });