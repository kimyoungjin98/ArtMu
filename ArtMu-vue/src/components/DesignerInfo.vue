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
  margin: 5px;
}
.des_info {
  margin: 20px;
  border: 1px solid lightgray;
  border-radius: 5px;
  height: 60vh;
  /* 나중에 수정해야함 */
  width: 273px;
}

.des_img {
  width: 270px;
  height: 270px;
}

.des_info p:nth-of-type(1) {
  font-size: 14px;
  color: gray;
  margin: 2px;
}
.des_info p:nth-of-type(2) {
  font-size: 20px;
  margin: 2px;
}
.des_info p:nth-of-type(3) {
  font-size: 16px;
  margin: 2px;
}
</style>
