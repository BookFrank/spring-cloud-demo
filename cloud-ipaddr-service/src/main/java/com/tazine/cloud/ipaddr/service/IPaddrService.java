package com.tazine.cloud.ipaddr.service;

import com.tazine.cloud.ipaddr.entity.IPInfo;
import com.tazine.cloud.ipaddr.utils.IPExt;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by lina on 2017/12/13.
 */
@Service
public class IPaddrService {

    static {
        IPExt.loadAsStream(ClassLoader.getSystemResourceAsStream("mydata4vipday1.datx"));
         // IPExt.loadAsStream(IPaddrService.class.getResourceAsStream("/mydata4vipday1.datx"));
    }

    public IPInfo ipSeek(String ip){
        IPInfo ipInfo = new IPInfo();
        String[] ipInfoArr = IPExt.find(ip);
        ipInfo.setCountry(ipInfoArr[0]);
        ipInfo.setProvince(ipInfoArr[1]);
        ipInfo.setCity(ipInfoArr[2]);
        ipInfo.setIsp(ipInfoArr[3]);
        ipInfo.setLatitude(ipInfoArr[4]);
        ipInfo.setLongitude(ipInfoArr[5]);
        ipInfo.setTimezone(ipInfoArr[6]);
        ipInfo.setTimezone_extra(ipInfoArr[7]);
        ipInfo.setArea_code(ipInfoArr[8]);
        ipInfo.setState_code(ipInfoArr[9]);
        ipInfo.setState_abbr(ipInfoArr[10]);
        ipInfo.setWorldContinentCode(ipInfoArr[11]);
        return ipInfo;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(IPExt.find("0.0.0.0")));

    }


}
