import PostService from './PostService';

export default class PostController {
    constructor() {
        this.name = "Testando controller!";
        console.log(PostService.getAll);
    }

    changeName() {
        this.name = 'Alterando o nome';
    }
}