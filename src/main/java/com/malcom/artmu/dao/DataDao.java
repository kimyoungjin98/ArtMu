package com.malcom.artmu.dao;

import com.malcom.artmu.model.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DataDao implements GenericDao<Data, String> {

    @Override
    public Data getData() {

        // 쌩 기본 정석 방식
//        Data data = new Data();
//        data.setId("@ddung2");
//        data.setName("뚱이");
//        data.setContent("응애 나 애기 뚱이");

        // 빌더해버리기
        // img 는 null 이 나와버린다
        Data data = Data.builder()
                .id("@ddung2")
                .name("뚱이")
                .content("응애애애")
                .build();

        return data;
    }

    @Override
    public List<Data> getList() {

        List<Data> dList = new ArrayList<Data>();
        for(int i = 0 ; i < 10 ; i++){
            Data data = Data.builder()
                    .id("@ddung2")
                    .name("뚱이")
                    .content("응애애애")
                    .build();
            dList.add(data);
        }

        return dList;
    }

}
