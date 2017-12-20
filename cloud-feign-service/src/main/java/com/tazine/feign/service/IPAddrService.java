package com.tazine.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign 接口，指定调用哪个服务。
 */
@FeignClient(value = "cloud-ipaddr-service")
public interface IPAddrService {
    @GetMapping(value = "/find")
    String findAddrByIP(@RequestParam("ip") String ip);
}
