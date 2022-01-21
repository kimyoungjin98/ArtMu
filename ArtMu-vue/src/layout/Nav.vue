<template>
  <nav class="main_nav" @scroll="onScroll">
    <p class="main_logo">ArtMu</p>
    <ul class="main_ul">
      <li><router-link to="/">Documents</router-link></li>
      <li><router-link to="/designer">Designer</router-link></li>
      <li><router-link to="/commision">Commision</router-link></li>
      <li><router-link to="/notice">Notice</router-link></li>
    </ul>
  </nav>
</template>

<script>
export default {
  name: "Nav",
  data() {
    return {
      scrollPosition: 0,
    };
  },
  methods: {
    onScroll(e) {
      this.scrollPosition = e.target.scrollTop;
      console.log(this.scrollPosition);
    },
  },
};
</script>

<style>
.main_nav {
  display: flex;
  background-color: rgb(39, 39, 39);
  padding: 35px;
  width: 100%;
}

.main_logo {
  font-size: 30px;
  color: white;
  font-weight: bold;
}

.main_ul {
  display: flex;
  list-style: none;
  margin-left: auto;
}

.main_ul li {
  font-size: 25px;
  margin: 0 40px;
}

li a {
  text-decoration: none;
  color: white;
}

li a:hover {
  transition: 0.5s ease;
  color: brown;
}
</style>
