'use strict';
 
App.factory('registerService', ['$http', '$q', function($http, $q){
 
    return {
         
            fetchAllCountries: function() {
                    return $http.get('http://localhost:8080/DealsUbuy/countryList')
                            .then(
                                    function(response){
                                        return response.data;
                                    }, 
                                    function(errResponse){
                                        console.error('Error while fetching countryList');
                                        return $q.reject(errResponse);
                                    }
                            );
            }
    };
 
}]);