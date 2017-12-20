package com.tazine.ipaddr.entity;

/**
 * IP 查询响应实体
 *
 * @author Frank
 * @since 1.0.0
 */
public class IPInfo {

    private String country;             // 国家
    private String province;            // 省会或直辖市（国内）
    private String city;                // 地区或城市（国内）
    private String addr;                // 学校或单位（国内）
    private String isp;                 // 运营商字段
    private String latitude;            // 纬度
    private String longitude;           // 经度
    private String timezone;            // 时区一（Asia/Shanghai）
    private String timezone_extra;      // 时区二（UTC+8）
    private String area_code;           // 中国行政区划代码 120000
    private String state_code;          // 国际电话代码
    private String state_abbr;          // 国家缩写
    private String worldContinentCode;  // 世界大洲代码

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezone_extra() {
        return timezone_extra;
    }

    public void setTimezone_extra(String timezone_extra) {
        this.timezone_extra = timezone_extra;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public String getState_code() {
        return state_code;
    }

    public void setState_code(String state_code) {
        this.state_code = state_code;
    }

    public String getState_abbr() {
        return state_abbr;
    }

    public void setState_abbr(String state_abbr) {
        this.state_abbr = state_abbr;
    }

    public String getWorldContinentCode() {
        return worldContinentCode;
    }

    public void setWorldContinentCode(String worldContinentCode) {
        this.worldContinentCode = worldContinentCode;
    }
}
