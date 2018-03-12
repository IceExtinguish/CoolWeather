package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ice_Extinguish on 2018/3/10.
 */

public class AQI {

    public AQICity city;

    public  class AQICity{

        public String aqi;

        public String pm25;
    }
}
