'use strict';

angular.module('app').controller('PostsController', PostsController);

function PostsController(PostService, $location) {

    var vm = this;
    vm.posts = {};

    initialize();

    function initialize() {
        loadPosts();
    }

    function loadPosts() {
        PostService.getAll().then(function(result) {
            vm.posts = result.data;
        });
    }
}