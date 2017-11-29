'use strict';
export default function routes($routeProvider) {

	$routeProvider.when('/posts', {
		template: require('./modules/post/posts.html'),
		controller: "PostController",
		controllerAs: "PostCtrl"
	});

	$routeProvider.otherwise({
		redirectTo: "/posts"
	});
}
