package com.kdev.weathertestapp.api;

import com.kdev.weathertestapp.models.Forecast;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("weather")
    Call<Forecast> getWeather(@Query("lat") String lat, @Query("lon") String lon);

}
