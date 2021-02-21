package com.example.app_r_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap gMap;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_main);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.google_map);
        mapFragment.getMapAsync(this);
    }


    public void onMapReady(GoogleMap googleMap) {
        /* Schools */
        LatLng school1 = new LatLng(48.5230722393805, 25.04220239839586);
        googleMap.addMarker(new MarkerOptions()
                .position(school1)
                .title("Kolomiya specialized school №1")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school)));

        LatLng school2 = new LatLng(48.53524140725038, 25.050242231127758);
        googleMap.addMarker(new MarkerOptions()
                .position(school2)
                .title("School № 2")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school)));

        LatLng school4 = new LatLng(48.52957524336969, 25.05846941634165);
        googleMap.addMarker(new MarkerOptions()
                .position(school4)
                .title("Secondary school of I-III degrees №4")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school)));

        /* Hospital */
        LatLng hospital1 = new LatLng(48.52367227100911, 25.054205999968126);
        googleMap.addMarker(new MarkerOptions()
                .position(hospital1)
                .title("Central District Hospital")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));

        LatLng hospital2 = new LatLng(48.526940965658, 25.05931408842597);
        googleMap.addMarker(new MarkerOptions()
                .position(hospital2)
                .title("Medychnyy Tsentr \"Zdorova Sim'ya\"")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));

        LatLng hospital3 = new LatLng(48.53374654205958, 25.032757044210772);
        googleMap.addMarker(new MarkerOptions()
                .position(hospital3)
                .title("Onkolohichnyy Dyspanser")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));

        /* Cultural institutions */
        LatLng museum1 = new LatLng(48.5283264535765, 25.039151683433275);
        googleMap.addMarker(new MarkerOptions()
                .position(museum1)
                .title("Pysanka Museum")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.museum)));

        LatLng museum2 = new LatLng(48.52880118840377, 25.037711085075955);
        googleMap.addMarker(new MarkerOptions()
                .position(museum2)
                .title("National Museum of Hutsulshchyna and Pokuttya Folk Arts")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.museum)));
    }
}



