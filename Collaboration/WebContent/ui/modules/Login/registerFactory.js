app.factory('registerFactory', ['$http','$q','$rootScope',function($http,$q,$rootScope){
	var address = 'http://localhost:8081/rest/';
	var addressForRegister = 'http://localhost:8081/rest/user/add';
	var self=this;
	return {
		registerUser:registerUser		
	};
	function registerUser(user){
		var deferred = $q.defer();
		$http.post(addressForRegister,user).
		then(function(response){
			deferred.resolve(response.data);
		},function(errResponse){
			deferred.reject(errResponse);
		});
		alert("Form Submitted " + user.email);
		return deferred.promise;
	};
	
}]);
