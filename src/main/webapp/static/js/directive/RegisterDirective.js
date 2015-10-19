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
      	  alert("in directive");
      	  ngModel.$validators.compareTo = function(modelValue) {
			 alert("in directive3");
			 alert(modelValue);
			  alert(scope.otherModelValue);

		  		  return modelValue == scope.otherModelValue;
		};



        }
      };
    });