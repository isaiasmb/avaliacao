
'use strict';
export default function ConfigRoute($routeProvider) {

	$routeProvider.when('/posts', {
		templateUrl: require('./modules/post/posts.html'),
		controller: "PostController",
		controllerAs: "PostCtrl"
	});

	$routeProvider.otherwise({
		redirectTo: "/posts"
	});
}
