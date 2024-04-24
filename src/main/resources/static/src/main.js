import Vue from 'vue'
import VueRouter from 'vue-router'
import {router} from './routes.js'
import IndexPasajesComponent from './components/indexPasajesComponent.vue';

Vue.use(VueRouter);

new Vue({
    router,
    render: h => h(IndexPasajesComponent)
  }).$mount('#app');

