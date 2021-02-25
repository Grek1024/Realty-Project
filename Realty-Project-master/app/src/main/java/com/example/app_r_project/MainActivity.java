package com.example.app_r_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.app.Application;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import androidx.room.Room;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    public static MainActivity instance;
    private RoomDB database;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.google_map);

        mapFragment.getMapAsync(this);

        instance = this;
        createDatabase();

        //For fill database 
//        QueryToDatabase queryToDatabase = new QueryToDatabase();
//        queryToDatabase.inputDate();

        }


    public void onMapReady(GoogleMap googleMap) {
        for(Building b: database.Dao().getAll()){
            String snippet = "Адреса: "+b.getAddress()+"\n"+"Реєстраційне посилання: "+b.getRegistration_doс_link();
            googleMap.addMarker(new MarkerOptions().position(new LatLng(b.getCoordinate(),b.getCoordinateTwo()))
                    .title(b.getAppointment()).icon(QueryToDatabase.selectImage(b.getAppointment())).snippet(snippet)
            );
        }

    }

    private void createDatabase(){
        database = Room.databaseBuilder(this, RoomDB.class, "database").fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
    }

    public static MainActivity getInstance() {
        return instance;
    }

    public RoomDB getDatabase() {
        return database;
    }

    public void onClickTest(View view){

    }

}



