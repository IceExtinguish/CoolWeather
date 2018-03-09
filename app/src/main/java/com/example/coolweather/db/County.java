package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Ice_Extinguish on 2018/3/9.
 */

public class County extends DataSupport {

    private int id;

    // 县名称
    private String countyName;

    // 天气id
    private String weaherId;

    // 记录当前县所属城市id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeaherId() {
        return weaherId;
    }

    public void setWeaherId(String weaherId) {
        this.weaherId = weaherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
