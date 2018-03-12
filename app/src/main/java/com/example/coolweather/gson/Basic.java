package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ice_Extinguish on 2018/3/10.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("update")
    public Updata updata;

    public class Updata{
        @SerializedName("loc")
        public String updataTime;
    }
}
