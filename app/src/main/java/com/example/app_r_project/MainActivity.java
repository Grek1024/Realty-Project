package com.example.app_r_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {

    GoogleMap gMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SupportMapFragment supportMapFragment = (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.google_map);

    }

    public void onMapReady(GoogleMap googleMap) {

        gMap = googleMap;

        gMap.setOnMapClickListener(latLng -> {
       MarkerOptions markerOptions =new MarkerOptions();

       markerOptions.position(latLng);

       markerOptions.title(latLng.latitude+" : "+latLng.longitude);

       gMap.clear();

       gMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,10));

       gMap.addMarker(markerOptions);
        });
    }
}



