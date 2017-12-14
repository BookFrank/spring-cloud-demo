package com.tazine.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lina on 2017/12/13.
 */
@Service
public class LoggerService {

    @Autowired
    private RestTemplate restTemplate;

    public String getIpInfo(String ip){
        return restTemplate.getForObject("http://cloud-ipaddr-service/find?ip="+ip, String.class);
    }

}
