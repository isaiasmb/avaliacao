(function () {
	'use strict';
	angular.module('app').config(ConfigRoute);

	function ConfigRoute($routeProvider) {

		$routeProvider.when("/posts", {
			templateUrl: "modules/post/posts.html",
			controller: "PostController",
			controllerAs: "PostCtrl"
		});

		$routeProvider.otherwise({
			redirectTo: "/posts"
		});
	}

})();