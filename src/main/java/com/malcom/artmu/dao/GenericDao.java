package com.malcom.artmu.dao;

import com.malcom.artmu.model.Data;

import java.util.List;

public interface GenericDao<VO, PK> {

    public Data getData();
    public List<Data> getList();

}
