<template>
  <div class="des_search">
    <input placeholder="Search Designer" />
    <Button><i class="fas fa-search"></i></Button>
  </div>
</template>

<script>
export default {
  name: "DesignerSearch",
};
</script>

<style>
.des_search {
  display: flex;
  padding: 20px;
  margin: 5px;
  width: 40vw;
}

.des_search input {
  flex: 1;
  border: 3px solid gray;
  border-radius: 20px;
  height: 50px;
  padding: 10px;
  font-size: 15px;
}

.des_search input:focus {
  transition: 0.2s ease;
  outline-color: red;
  border: 3px solid white;
}

.des_search button {
  position: relative;
  background-color: white;
  border: none;
  right: 30px;
  /* 
  right: 20px;
  color: black;
  height: 50px;
  padding: 5px;
  width: 10vh; */
  outline: none;
  font-size: 20px;
}
</style>
