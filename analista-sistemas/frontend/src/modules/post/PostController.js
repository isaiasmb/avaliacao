'use strict';

angular.module('app').controller('PostController', PostController);

function PostController(PostService, CommentService, $route, $location) {

    var vm = this;
    vm.postId = $route.current.params.id;
    vm.post = {};
    vm.comments = [];

    initialize();

    function initialize() {
        loadPost();
        loadComments();
    }

    function loadPost() {
        PostService.getPost(vm.postId).then(function(result) {
            vm.post = result.data;
        }).catch(function(result) {
            if (result.status == 404) {
                $location.path('/404');
            }
        });
    }

    function loadComments() {
        CommentService.getCommentsById(vm.postId).then(function(result) {
            vm.comments = result.data;
        });
    }
}