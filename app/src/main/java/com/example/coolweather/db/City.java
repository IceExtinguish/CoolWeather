package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Ice_Extinguish on 2018/3/9.
 */

public class City extends DataSupport {

    private int id;
    // 市名
    private String cityName;
    // 当前市所属省的id
    private int provinceId;
    // 市的代号
    private int cityCode;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
