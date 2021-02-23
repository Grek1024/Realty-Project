package com.example.app_r_project;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class QueryToDatabase {

    public static void inputDate(){
        //building.address="вулиця Адама Міцкевича, 3, Коломия, Івано-Франківська область, 78200";

        new com.example.app_r_project.AsyncTask().execute(new Building("Школа","Kolomiya specialized school №1",
              new Double(48.5230722393805), new Double(25.04220239839586)));

        new com.example.app_r_project.AsyncTask().execute(new Building("Школа","School № 2",new Double(48.53524140725038),   new Double(25.050242231127758)));
        new com.example.app_r_project.AsyncTask().execute(new Building("Школа","Secondary school of I-III degrees №4",
                new Double(48.52957524336969), new Double(25.05846941634165)));
        new com.example.app_r_project.AsyncTask().execute(new Building("Лікарня","Central District Hospital",
                new Double(48.52367227100911), new Double(25.054205999968126)));
        new com.example.app_r_project.AsyncTask().execute(new Building("Лікарня","Medychnyy Tsentr \"Zdorova Sim'ya\"",
                new Double(48.526940965658), new Double(25.05931408842597)));
        new com.example.app_r_project.AsyncTask().execute(new Building("Лікарня","Onkolohichnyy Dyspanser",
                new Double(48.53374654205958), new Double(25.032757044210772)));
        new com.example.app_r_project.AsyncTask().execute(new Building("Музей","Pysanka Museum",
                new Double(48.5283264535765), new Double(25.039151683433275)));
        new com.example.app_r_project.AsyncTask().execute(new Building("Музей","National Museum of Hutsulshchyna and Pokuttya Folk Arts",
                new Double(48.52880118840377), new Double(25.037711085075955)));
    }

    public static BitmapDescriptor selectImage(String typeBuild){
        switch (typeBuild){
            case "Школа":
                return BitmapDescriptorFactory.fromResource(R.drawable.school);
            case "Музей":
                return BitmapDescriptorFactory.fromResource(R.drawable.museum);
            case "Лікарня":
                return BitmapDescriptorFactory.fromResource(R.drawable.hospital);
        }
        return null;
    }

}
