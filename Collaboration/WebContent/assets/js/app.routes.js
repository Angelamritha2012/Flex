
app.config(['$routeProvider','$locationProvider',function($routeProvider,$locationProvider){
	$routeProvider.
when('/blog',{
	templateUrl:'./ui/blog.html',
}).
when('/forum',{
	templateUrl:'./ui/forum.html',
}).
when('/',{
	templateUrl:'./ui/.html',
}).
when('/job',{
	templateUrl:'./ui/job.html',
})
}]);

	

	
