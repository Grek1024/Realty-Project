package com.example.app_r_project;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Date;


@Entity
public class Building {
//PK
    @PrimaryKey(autoGenerate = true)
    public int id;

//адреса
    @ColumnInfo(name = "address")
    public String address;

//призначення
    @ColumnInfo(name = "appointmant")
    public String appointmant;

//площа
    @ColumnInfo(name = "area")
    public double area;

//балансова вартість
@ColumnInfo(name = "price")
public double price;

//рік побудови
@ColumnInfo(name = "year_of_construction")
public int year_construction;

//реєстраційний документ
@ColumnInfo(name = "registration_document")
public String registration_doс_link;

//дата введення в експлуатацію
@ColumnInfo(name = "date_of_commissioning")
public String date_commissioning;

//стан будівлі
@ColumnInfo(name = "condition")
public String condition;

//Наявність проектно-кошторисної документації
@ColumnInfo(name = "design_and_estimate_documentation")
public String estimate_documentation;

// Наявність місця для парковки
@ColumnInfo(name = "parking place")
public String parking_place;

//доступність для людей з обмеженнями
@ColumnInfo(name = "accessibility")
public String accessibility;

//Сфера підпорядкування
@ColumnInfo(name = "sphere_of_subordination")
public String subordination;

//Координати lat
@ColumnInfo(name = "coordinates_lat")
public double coordinates_lat;

//Координати lat
@ColumnInfo(name = "coordinates_long")
public double coordinates_long;






}
