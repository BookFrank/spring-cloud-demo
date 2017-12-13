package com.tazine.cloud.ipaddr.controller;

import com.tazine.cloud.ipaddr.entity.IPInfo;
import com.tazine.cloud.ipaddr.service.IPaddrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * IP 查询服务控制器
 */
@RestController
public class IPaddrController {

    @Autowired
    private IPaddrService ipService;

    @GetMapping(value = "/find")
    public IPInfo find(@RequestParam("ip") String ip){
        return ipService.ipSeek(ip);
    }

}
