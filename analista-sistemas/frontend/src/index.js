import angular from 'angular';
import ngRoute from 'angular-route';

import './style.css';

import routes from './routes';

import PostController from './modules/post/PostController'

export default angular.module('app', [ 'ngRoute' ])
    .config(routes)
    .controller('PostController', PostController);