package com.example.app_r_project;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DAO {
    @Query("SELECT * FROM building")
    List<Building> getAll();

    @Query("SELECT * FROM building WHERE id = :buildingId")
    Building getById(long buildingId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Building building);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(Building... buildings);

    @Delete
    void delete(Building building);

    @Query("Delete from building where id>=0")
    void deleteAll();
}
