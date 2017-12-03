(function() {
	'use strict';
	angular.module('app').service('PostService', PostService);

	function PostService($http) {
		this.getPost = function(postId) {
			return $http.get("http://jsonplaceholder.typicode.com/posts/" + postId);
		};

		this.getAll = function() {
			return $http.get("http://jsonplaceholder.typicode.com/posts");
		};
	}
})();
