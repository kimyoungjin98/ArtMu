<template>
  <nav class="main_nav">
    <p class="main_logo">ArtMu</p>
    <ul class="main_ul">
      <li v-for="menu in menus" :key="menu" class="main_li">{{ menu }}</li>
    </ul>
  </nav>
</template>

<script>
export default {
  name: "Nav",
  data() {
    return {
      menus: ["Documents", "Designer", "Commission", "Notice"],
    };
  },
};
</script>

<style>
.main_nav {
  display: flex;
  background-color: rgba(0, 0, 0, 0.8);
  padding: 35px;
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

.main_li {
  font-size: 25px;
  color: white;
  margin: 0 40px;
}

.main_li:hover {
  transition: 0.5s ease;
  color: brown;
  cursor: pointer;
}
</style>
