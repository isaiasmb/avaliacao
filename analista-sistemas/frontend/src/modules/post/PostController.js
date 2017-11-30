'use strict';

angular.module('app').controller('PostController', PostController);

function PostController(PostService) {

    var vm = this;

    initialize();

    function initialize() {
        vm.loadPosts();
    }
}