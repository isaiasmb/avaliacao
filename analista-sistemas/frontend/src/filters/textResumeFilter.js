(function() {
	'use strict';

	angular.module('app').filter('textResumeFilter', function() {
		return function (input, size) {
		if (input.length <= size) return input;
		var output = input.substring(0,(size || 2)) + "...";
		return output;
	};
	});

})();