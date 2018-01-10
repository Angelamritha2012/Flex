
app.config(['$routeProvider','$locationProvider',function($routeProvider,$locationProvider){
	$routeProvider.
when('/blog',{
	templateUrl:'./ui/modules/Blog/blog.html',
}).
when('/bloglist',{
	templateUrl:'./ui/modules/Blog/bloglist.html',
}).
when('/forum',{
	templateUrl:'./ui/modules/Forum/forum.html',
}).
when('/forumlist',{
	templateUrl:'./ui/modules/Forum/forumlist.html',
}).
when('/login',{
	templateUrl:'./ui/modules/Login/login.html',
}).
when('/',{
	templateUrl:'./ui/Common/home.html',
}).
when('/profile',{
	templateUrl:'./ui/modules/Admin/profile.html',
}).
when('/dashboard',{
	templateUrl:'./ui/modules/Admin/dashboard.html',
}).
when('/event',{
	templateUrl:'./ui/modules/Event/event.html',
}).
when('/job',{
	templateUrl:'./ui/modules/Job/job.html',
})
}]);

	

	
