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
  font-family: "IBMPlexSansKR-Regular";
}

body {
  -ms-overflow-style: none;
}
::-webkit-scrollbar {
  display: none;
}

@font-face {
  font-family: "IBMPlexSansKR-Regular";
  src: url("https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-07@1.0/IBMPlexSansKR-Regular.woff")
    format("woff");
  font-weight: normal;
  font-style: normal;
}
</style>
