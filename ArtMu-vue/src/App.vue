<template>
  <div>
    <Nav></Nav>
    <router-view />
  </div>
</template>

<script>
import Nav from "./layout/Nav.vue";

export default {
  name: "App",
  components: { Nav },
  method: {},
};
</script>

<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
</style>
