package com.kdev.weathertestapp.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.kdev.weathertestapp.R;
import com.kdev.weathertestapp.ui.homeView.HomeActivity;

import static com.kdev.weathertestapp.common.Constants.SPLASH_DELAY;

public class SplashActivity extends MvpAppCompatActivity implements SplashView {

    @InjectPresenter
    SplashPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    public void navigateToHomeView() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                SplashActivity.this.startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                SplashActivity.this.finish();
            }
        }, SPLASH_DELAY);
    }
}
