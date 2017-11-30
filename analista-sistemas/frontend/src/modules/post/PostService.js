(function() {
	'use strict';
	angular.module('app').service('PostService', PostService);

	function PostService($http) {
		this.getAll = function() {
			return $http.get("http://jsonplaceholder.typicode.com/posts");
		};
	}
})();
