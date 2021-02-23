package com.example.app_r_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.app.Application;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import androidx.room.Room;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap gMap;
    public static MainActivity instance;
    private RoomDB database;
    private DAO buildingDao;
    ArrayList<Building> buildingList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_main);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.google_map);
        mapFragment.getMapAsync(this);


        instance = this;
        database = Room.databaseBuilder(this, RoomDB.class, "database")
                .build();

        RoomDB db = MainActivity.getInstance().getDatabase();
        buildingDao = db.Dao();


        //1
        Building building1= new Building();
        building1.address="вулиця Адама Міцкевича, 3, Коломия, Івано-Франківська область, 78200";
        building1.appointmant="Установа загальної середньої освіти";
        building1.coordinates_lat=48.5230722393805;
        building1.coordinates_long=25.04220239839586;

        //2
        Building building2= new Building();
        building2.address="вулиця Миколи Лисенка, 24, Коломия, Івано-Франківська область, 78200";
        building2.appointmant="Установа загальної середньої освіти";
        building2.coordinates_lat=48.53524140725038;
        building2.coordinates_long=25.050242231127758;

        //3
        Building building3= new Building();
        building3.address="вулиця Марії Заньковецької, 11, Коломия, Івано-Франківська область, 78200";
        building3.appointmant="Установа загальної середньої освіти";
        building3.coordinates_lat=48.52957524336969;
        building3.coordinates_long=25.05846941634165;

        //4
        Building building4= new Building();
        building4.address="вул. Родини Крушельницьких, 26, Коломия, Івано-Франківська область, 78200";
        building4.appointmant="Центральна районна лікарня";
        building4.coordinates_lat=48.52367227100911;
        building4.coordinates_long=25.054205999968126;
        //5
        Building building5= new Building();
        building4.address="вулиця Івана Богуна, 40, Коломия, Івано-Франківська область, 78200";
        building4.appointmant="Медичний Центр";
        building4.coordinates_lat=48.526940965658;
        building4.coordinates_long=25.05931408842597;
        //6
        Building building6= new Building();
        building4.address="вулиця Івана Франка, 31, Коломия, Івано-Франківська область, 78200";
        building4.appointmant="Онкологічний диспансер";
        building4.coordinates_lat=48.53374654205958;
        building4.coordinates_long=25.032757044210772;

        //7
        Building building7= new Building();
        building4.address="проспект В'ячеслава Чорновола, 43Б, Коломия, Івано-Франківська область, 78200";
        building4.appointmant="Музей Писанки";
        building4.coordinates_lat=48.5283264535765;
        building4.coordinates_long=25.039151683433275;

        //8
        Building building8= new Building();
        building4.address=" вулиця Театральна, 25, Коломия, Івано-Франківська область, 78200";
        building4.appointmant="Національний музей народного мистецтва Гуцульщини та Покуття";
        building4.coordinates_lat=48.52880118840377;
        building4.coordinates_long=25.037711085075955;


        new InsertAsyncTask().execute(building1);
        new InsertAsyncTask().execute(building2);
        new InsertAsyncTask().execute(building3);
        new InsertAsyncTask().execute(building4);
        new InsertAsyncTask().execute(building5);
        new InsertAsyncTask().execute(building6);
        new InsertAsyncTask().execute(building7);
        new InsertAsyncTask().execute(building8);
        new QueryAsyncTask().execute();

        }





            public static MainActivity getInstance() {
                return instance;
            }

            public RoomDB getDatabase() {
                return database;

    }
    private class InsertAsyncTask extends AsyncTask<Building, Void, Void> {

        Building building;

        @Override
        protected Void doInBackground(Building... buildings) {
            building = buildings[0];
            buildingDao.add(building);
            return null;
        }
    }
    private class QueryAsyncTask extends AsyncTask<Void, Void, Void> {

    @Override
   protected Void doInBackground(Void... voids) {
       buildingList = (ArrayList<Building>) buildingDao.getAll();
       return null;

        }
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



