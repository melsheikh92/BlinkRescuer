package com.beanit.mahmoud.blinkrescuer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;

public class NavigateActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private GoogleMap mMap;
    MapView mapview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Blibk Rescuer");
        toolbar.setLogo(R.drawable.logoxml);
        mapview= (MapView) findViewById(R.id.mapView);

        mapview.onCreate(savedInstanceState);
        mapview.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                setUpMap(googleMap);
            }
        });


    }
    private void setUpMap(GoogleMap map) {
        mMap = map;


    }


    }

