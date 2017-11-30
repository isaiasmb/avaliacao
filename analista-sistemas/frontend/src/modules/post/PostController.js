'use strict';

angular.module('app').controller('PostController', PostController);

function PostController(PostService) {

    var vm = this;

    initialize();

    function initialize() {
        vm.loadPosts();
    }

    function loadPosts() {
        PostService.getAll().then(function(result) {
            vm.posts = result.data;
            console.log(vm.posts);
        });
    }

}