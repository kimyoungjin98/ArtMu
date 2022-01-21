<template>
  <div class="des_list">
    <div class="des_info" v-for="info in infos" :key="info">
      <img :src="info.img" class="des_img" />
      <p>{{ info.id }}</p>
      <p>{{ info.name }}</p>
      <p>{{ info.content }}</p>
    </div>
  </div>
</template>

<script>
export default {
  name: "DesignerInfo",
  props: {
    infos: {
      type: Array,
      required: true,
    },
  },
};
</script>

<style>
.des_list {
  display: flex;
  flex-wrap: wrap;
}
.des_info {
  margin: 20px;
  border: 1px solid lightgray;
  height: 60vh;
}
.des_img {
  width: 300px;
  height: 300px;
}

.des_info p:nth-of-type(1) {
  font-size: 14px;
  color: gray;
}
.des_info p:nth-of-type(2) {
  font-size: 20px;
}
des_info p:nth-of-type(3) {
  font-size: 16px;
}
</style>
