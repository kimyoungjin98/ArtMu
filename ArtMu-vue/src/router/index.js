import { createWebHistory, createRouter } from "vue-router";
import Documents from "../pages/Documents";
import Designer from "../pages/Designer";
import Commision from "../pages/Commision";
import Notice from "../pages/Notice";

const routes = [
  {
    path: "/",
    name: "Documents",
    component: Documents,
  },
  {
    path: "/designer",
    name: "Designer",
    component: Designer,
  },
  {
    path: "/commision",
    name: "Commision",
    component: Commision,
  },
  {
    path: "/notice",
    name: "Notice",
    component: Notice,
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
