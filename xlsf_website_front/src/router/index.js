import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/views/home/Home.vue'
import Login from '@/views/login/Login.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/home',
      name: 'Home',
      component: Home
    }
  ]
})
