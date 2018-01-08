app.controller('registerController',['registerFactory','$rootScope','$location','$scope','$localStorage', function(registerFactory, $rootScope,$location,$scope,$localStorage){
	var self=this;
	self.user={email:'',name:'',role:'',contact:'',password:'',status:'', enabled:''};
	self.registerUser=function(){
		self.user.status=true;
		self.user.enabled=true;
		registerFactory.registerUser(self.user);
	}	
}]);