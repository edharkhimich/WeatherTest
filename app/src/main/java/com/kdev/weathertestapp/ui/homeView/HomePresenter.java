package com.kdev.weathertestapp.ui.homeView;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.kdev.weathertestapp.api.Api;
import com.kdev.weathertestapp.common.Constants;
import com.kdev.weathertestapp.models.Forecast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@InjectViewState
public class HomePresenter extends MvpPresenter<HomeView> {

    public HomePresenter() {
        Api.getInstance().getApiInterface().getWeather(Constants.LOCATION_LAT, Constants.LOCATION_LONG)
                .enqueue(new Callback<Forecast>() {
                    @Override
                    public void onResponse(Call<Forecast> call, Response<Forecast> response) {

                    }

                    @Override
                    public void onFailure(Call<Forecast> call, Throwable t) {

                    }
                });
    }
}
