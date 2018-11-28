package com.kdev.weathertestapp.ui.splash;

import android.util.Log;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class SplashPresenter extends MvpPresenter<SplashView> {

    public SplashPresenter() {
        getViewState().navigateToHomeView();
    }
}
