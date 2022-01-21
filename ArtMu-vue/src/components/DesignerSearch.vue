<template>
  <div class="des_search">
    <input placeholder="Search Designer" />
    <Button>Search</Button>
  </div>
</template>

<script>
export default {
  name: "DesignerSearch",
};
</script>

<style>
.des_search {
  display: inline-block;
  padding: 20px;
}

.des_search input {
  border: 3px solid black;
  width: 50vh;
  padding: 10px;
  outline: none;
}

.des_search button {
  border: 3px solid black;
  color: white;
  background-color: black;
  padding: 10px;
  width: 10vh;
  outline: none;
}
</style>
