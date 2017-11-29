

export default function PostService($http) {
    this.getAll = function() {
        console.log("getAll");
        return ["Post 1", "Post 2", "Post 3", "Post 4"];
    }

}