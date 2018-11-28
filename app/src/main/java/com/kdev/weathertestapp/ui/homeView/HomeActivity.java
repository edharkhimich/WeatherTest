package com.kdev.weathertestapp.ui.homeView;

import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.kdev.weathertestapp.R;
import com.kdev.weathertestapp.common.Constants;

import butterknife.ButterKnife;

public class HomeActivity extends MvpAppCompatActivity implements HomeView, OnMapReadyCallback {

    @InjectPresenter
    HomePresenter presenter;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.homeMapVw);

        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng placeLocation = new LatLng(Double.valueOf(Constants.LOCATION_LAT),Double.valueOf(Constants.LOCATION_LONG));
        Marker placeMarker = googleMap.addMarker(new MarkerOptions().position(placeLocation)
                .title(getString(R.string.place_title)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(placeLocation));

        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.setMinZoomPreference(11);
    }
}
