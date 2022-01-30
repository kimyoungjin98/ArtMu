package com.malcom.artmu.controller;

import com.malcom.artmu.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class DataController {

    protected final DataService dataService;

    @ResponseBody
    @RequestMapping(value = "/designer" , method = RequestMethod.GET)
    public String Data()  {

        // 1.컨트롤러 : View에 데이터만 전달
        // 2.서비스 : Dao한테 받은 데이터 가공
        // 3.Dao : DB(가상)에서 받은 데이터 서비스로 줘야됨

        String data = dataService.getData();

        return data;
    }

    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String List(){

        String dList = dataService.getList();
        return dList;
    }

}
