package com.malcom.artmu.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.malcom.artmu.dao.DataDao;
import com.malcom.artmu.model.Data;
import com.malcom.artmu.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DataServiceImpl implements DataService {

    protected final DataDao dataDao;

    @Override
    public String getData() {
       Data data = dataDao.getData();

       ObjectMapper objMapper = new ObjectMapper();
       String jsonString = null;
        try {
            // writeValueAsString : String 형태의 Json 으로 parsing !!
            jsonString = objMapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            System.out.println("JSON Parsing 오류 !");
        }

        return jsonString;
    }

    @Override
    public String getList() {

        List<Data> dList = dataDao.getList();

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = objectMapper.writeValueAsString(dList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            System.out.println("JSON Parsing List 오류");
        }

        return jsonString;
    }
}
