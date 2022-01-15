<template>
  <h1>홈 화면</h1>
</template>

<script>
export default {
  name: "App",
  components: {},
  method: {},
  created() {
    fetch("http://localhost:8080")
      .then((res) => res.text)
      .then((res) => () => {
        if (res == "OK") {
          console.log("성공");
        } else {
          console.log("실패");
        }
      });
  },
};
</script>

<style></style>
