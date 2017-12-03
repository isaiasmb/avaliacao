(function () {
	'use strict';
	angular.module('app').config(ConfigRoute);

	function ConfigRoute($routeProvider) {

		$routeProvider.when("/posts", {
			templateUrl: "src/modules/post/posts.html",
			controller: "PostsController",
			controllerAs: "PostsCtrl"
		});
		
		$routeProvider.when("/post/:id", {
			templateUrl: "src/modules/post/post.html",
			controller: "PostController",
			controllerAs: "PostCtrl"
		});

		$routeProvider.when("/404", {
			templateUrl: "src/partials/404.html",
		});
		
		$routeProvider.otherwise({
			redirectTo: "/post/1"
		});
	}

})();