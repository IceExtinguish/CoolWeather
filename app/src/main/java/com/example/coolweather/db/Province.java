package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 存放省的数据
 * Created by Ice_Extinguish on 2018/3/9.
 */

public class Province extends DataSupport{

    private int id;
    // 省名
    private String provinceName;
    // 省代号
    private int provinceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }
}
