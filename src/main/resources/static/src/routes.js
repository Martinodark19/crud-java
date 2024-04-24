import VueRouter from 'vue-router';
import crearViajesComponent from './components/crearViajesComponent.vue';
import viajesComponent from './components/viajes/viajesComponent.vue';


export const routes = 
[
    {
        path: '/crearViajes',
        component: crearViajesComponent,
    },
  
    {
        name: 'viajesComponent',
        path: '/viajes',
        component:viajesComponent,
    }
]

const router = new VueRouter({
    routes
  });
  
  export default router;