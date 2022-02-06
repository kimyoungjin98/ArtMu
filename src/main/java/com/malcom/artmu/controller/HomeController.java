package com.malcom.artmu.controller;

import com.malcom.artmu.service.TwitterLoadingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class HomeController {

    protected final TwitterLoadingService tService;

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        tService.TestTwitterLoading();
        System.out.println("야 ㅡㅡ ");

        return null;
    }
}
