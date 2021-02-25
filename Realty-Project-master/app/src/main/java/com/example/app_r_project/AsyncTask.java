package com.example.app_r_project;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class AsyncTask extends android.os.AsyncTask<Building, Void, Void> {

    @Override
    protected Void doInBackground(Building... buildings) {
        Building building = buildings[0];

        if(building!=null)
        MainActivity.getInstance().getDatabase().Dao().insert(building);

        return null;
    }


    }


