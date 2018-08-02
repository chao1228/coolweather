package com.coolweather.android;

import com.coolweather.android.gson.Forecast;

/**
 * Created by liuchao on 18-8-2.
 */

public class ShowArea {
    private String cityName;
    private Forecast.Temperature temperature;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Forecast.Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Forecast.Temperature temperature) {
        this.temperature = temperature;
    }
}
