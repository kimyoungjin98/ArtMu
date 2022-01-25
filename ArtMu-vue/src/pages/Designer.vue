<template>
  <div class="des_container">
    <designer-search />
    <designer-info v-bind:infos="infos" />
  </div>
</template>

<script>
import DesignerInfo from "../components/DesignerInfo.vue";
import DesignerSearch from "../components/DesignerSearch.vue";
/**
 * 1. 디자이너 정보 컴포넌트
 * 2. 디자이너 검색 컴포넌트
 * 3. 인기순, 최신순 컴포넌트
 * 4. 페이지네이션
 */
export default {
  components: { DesignerInfo, DesignerSearch },
  name: "Designer",
  data() {
    return {
      infos: [
        {
          id: "@ddung2",
          name: "뚱이",
          content: "응애 나 애기 뚱이",
          img: require("../assets/뚱이.jpeg"),
        },
        {
          id: "@ddung2",
          name: "뚱이",
          content: "아뇨 저는 뚱인데요?",
          img: require("../assets/뚱이.jpeg"),
        },
        {
          id: "@ddung2",
          name: "뚱이",
          content: "아뇨 저는 뚱인데요?",
          img: require("../assets/뚱이.jpeg"),
        },
        {
          id: "@ddung2",
          name: "뚱이",
          content: "아뇨 저는 뚱인데요?",
          img: require("../assets/뚱이.jpeg"),
        },
        {
          id: "@ddung2",
          name: "뚱이",
          content: "아뇨 저는 뚱인데요?아뇨 저는 뚱인데요?아뇨 저는 뚱인데요?아뇨 저는 뚱인데요?아뇨 저는 뚱인데요?아뇨 저는 뚱인데요?아뇨 저는 뚱인데요?아뇨 저는 뚱인데요?",
          img: require("../assets/뚱이.jpeg"),
        },
        {
          id: "@ddung2",
          name: "뚱이",
          content: "아뇨 저는 뚱인데요?",
          img: require("../assets/뚱이.jpeg"),
        },
        {
          id: "@ddung2",
          name: "뚱이",
          content: "아뇨 저는 뚱인데요?",
          img: require("../assets/뚱이.jpeg"),
        },
      ],
    };
  },
};
</script>

<style>
.des_container {
  display: flex;
  flex-direction: column;
}
</style>
