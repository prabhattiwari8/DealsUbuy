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
            },
            fetchAllStates: function() {
                return $http.get('http://localhost:8080/DealsUbuy/stateList')
                        .then(
                                function(response){
                                    return response.data;
                                },
                                function(errResponse){
                                    console.error('Error while fetching stateList');
                                    return $q.reject(errResponse);
                                }
                        );
},
fetchAllCities: function() {
    return $http.get('http://localhost:8080/DealsUbuy/cityList')
            .then(
                    function(response){
                        return response.data;
                    },
                    function(errResponse){
                        console.error('Error while fetching cityList');
                        return $q.reject(errResponse);
                    }
            );
}
    };
   
 
}]);