package com.example.app_r_project;



import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities = {Building.class}, version = 1)
public abstract class RoomDB extends RoomDatabase {
    public abstract DAO Dao();

}
