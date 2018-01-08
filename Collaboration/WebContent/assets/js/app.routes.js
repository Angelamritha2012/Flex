
app.config(['$routeProvider','$locationProvider',function($routeProvider,$locationProvider){
	$routeProvider.
when('/blog',{
	templateUrl:'./ui/blog.html',
}).
when('/bloglist',{
	templateUrl:'./ui/bloglist.html',
}).
when('/forum',{
	templateUrl:'./ui/forum.html',
}).
when('/forumlist',{
	templateUrl:'./ui/forumlist.html',
}).
when('/login',{
	templateUrl:'./ui/login.html',
}).
when('/',{
	templateUrl:'./ui/.html',
}).
when('/job',{
	templateUrl:'./ui/job.html',
})
}]);

	

	
