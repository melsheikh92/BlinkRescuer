package com.beanit.mahmoud.blinkrescuer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;

public class AccReqActivity extends AppCompatActivity {
    Button btn_accept;
  private GoogleMap mMap;
   MapView mapview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acc_req);
        Circle circle = (Circle) findViewById(R.id.circle);

        CircleAngleAnimation animation = new CircleAngleAnimation(circle, 360);
        animation.setDuration(2000);
        circle.startAnimation(animation);
btn_accept= (Button) findViewById(R.id.btn_accept);;
        btn_accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),NavigateActivity.class);
                startActivity(i);
            }
        });
//        mapview= (MapView) findViewById(R.id.mapView);
//
//        mapview.onCreate(savedInstanceState);
//        mapview.getMapAsync(new OnMapReadyCallback() {
//            @Override
//            public void onMapReady(GoogleMap googleMap) {
//                setUpMap(googleMap);
//            }
//        });


    }
    private void setUpMap(GoogleMap map) {
        mMap = map;


    }
}
