(function() {
	'use strict';
	angular.module('app').service('CommentService', CommentService);

	function CommentService($http) {
		this.getCommentsById = function(postId) {
			return $http.get("http://jsonplaceholder.typicode.com/comments?postId=" + postId);
		};
	}
})();
