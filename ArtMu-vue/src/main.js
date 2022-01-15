import { createApp } from "vue";
import App from "./App.vue";

const router = new VueRouter({
  mode: "history",
  routes: [
    { path: "/doc", component: Documents },
    { path: "/designer", component: Designer },
  ],
});

new Vue({
  router: router,
});

createApp(App).mount("#app");
