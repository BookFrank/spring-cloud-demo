package com.tazine.ipaddr.controller;

import com.tazine.ipaddr.entity.IPInfo;
import com.tazine.ipaddr.service.IPaddrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * IP 查询服务控制器
 *
 * @author frank
 * @since 1.0.0
 */
@RestController
public class IPaddrController {

    @Value(value = "server.port")
    private String port;

    @Autowired
    private IPaddrService ipService;

    @GetMapping(value = "/find")
    public IPInfo find(@RequestParam("ip") String ip) {
        return ipService.ipSeek(ip);
    }

    @GetMapping(value = "/hi")
    public String hi(@RequestParam("name") String name){
        return "Hi " + name + ", I am a service provider at port " + port;
    }
}
