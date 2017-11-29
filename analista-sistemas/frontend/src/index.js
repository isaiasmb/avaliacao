import angular from 'angular';
import ngRoute from 'angular-route';

import './style.css';

import configRoute from './configRoute';

import PostController from './modules/post/PostController'


export default angular.module('app', [ 'ngRoute' ])
    .config(configRoute)
    .controller('PostController', PostController);