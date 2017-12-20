package com.tazine.feign.controller;

import com.tazine.feign.service.IPAddrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过Feign接口来消费服务
 *
 * @author frank
 * @since 1.0.0
 */
@RestController
public class FeignController {

    @Autowired
    private IPAddrService ipAddrService;

    /**
     * http://127.0.0.1:8004/feign/find?ip=124.251.25.20
     * @param ip
     * @return
     */
    @GetMapping(value = "/feign/find")
    public String findAddrByIp(@RequestParam("ip") String ip) {
        return ipAddrService.findAddrByIP(ip);
    }
}
