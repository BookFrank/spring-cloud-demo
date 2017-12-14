package com.tazine.cloud.controller;

import com.tazine.cloud.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lina on 2017/12/13.
 */
@RestController
public class IndexController {

    @Autowired
    private LoggerService loggerService;

    @GetMapping(value = "/log")
    public String index(@RequestParam String ip){

        return loggerService.getIpInfo(ip);
    }


}
