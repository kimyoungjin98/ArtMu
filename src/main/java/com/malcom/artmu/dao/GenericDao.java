package com.malcom.artmu.dao;

import java.util.List;

public interface GenericDao<VO, PK> {

    public VO getData();
    public List<VO> getList();

}
