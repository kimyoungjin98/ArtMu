# ArtMu
- Spring Boot + Vue.js + Cloud FireStore
- 2021-01 ~ 

## Json 가공하기
### 구글 Gson
- JSONParser jsonParser = new JSONParser(); 
- JSONObject jsonObject = (JSONObject) jsonParser.parse(String.valueOf(data));

### 잭슨바인드
- ObjectMapper objectMapper = new ObjectMapper();
- String jsonString = objectMapper.writeValueAsString(dList);
- Boot 에서는 기본으로 제공된다.
