package com.example.app_r_project;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.android.gms.maps.model.LatLng;

import java.sql.Date;

    @Entity
    public class Building {

        public Building(){

        }

        public Building(String typeBuild, String appointment, Double coordinateFirst, Double coordinateTwo){
        this.appointment = appointment;
        this.coordinate = coordinateFirst;
        this.coordinateTwo = coordinateTwo;
        this.typeBuild = typeBuild;
        }

        //PK
        @PrimaryKey(autoGenerate = true)
        private int id;

        //адреса
        @ColumnInfo(name = "address")
        private String address;

        //призначення
        @ColumnInfo(name = "appointment")
        private String appointment;

        //площа
        @ColumnInfo(name = "area")
        private double area;

        //балансова вартість
        @ColumnInfo(name = "price")
        private double price;

        //рік побудови
        @ColumnInfo(name = "year_of_construction")
        private int year_construction;

        //реєстраційний документ
        @ColumnInfo(name = "registration_document")
        private String registration_doс_link;

        //дата введення в експлуатацію
        @ColumnInfo(name = "date_of_commissioning")
        private String date_commissioning;

        //стан будівлі
        @ColumnInfo(name = "condition")
        private String condition;

        //Наявність проектно-кошторисної документації
        @ColumnInfo(name = "design_and_estimate_documentation")
        private String estimate_documentation;

        // Наявність місця для парковки
        @ColumnInfo(name = "parking place")
        private String parking_place;

        //доступність для людей з обмеженнями
        @ColumnInfo(name = "accessibility")
        private String accessibility;

            //Сфера підпорядкування
        @ColumnInfo(name = "sphere_of_subordination")
        private String subordination;

        //Кількість поверхів
        @ColumnInfo(name = "number_of_floors")
        private int floors;

        @ColumnInfo(name = "place_coordinates")
        private Double coordinate;


        @ColumnInfo(name = "place_coordinates_Two")
        private Double coordinateTwo;

        @ColumnInfo(name = "type_building")
        private String typeBuild;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTypeBuild() {
            return typeBuild;
        }

        public void setTypeBuild(String typeBuild) {
            this.typeBuild = typeBuild;
        }


        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getAppointment() {
            return appointment;
        }

        public void setAppointment(String appointment) {
            this.appointment = appointment;
        }

        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getYear_construction() {
            return year_construction;
        }

        public void setYear_construction(int year_construction) {
            this.year_construction = year_construction;
        }

        public String getRegistration_doс_link() {
            return registration_doс_link;
        }

        public void setRegistration_doс_link(String registration_doс_link) {
            this.registration_doс_link = registration_doс_link;
        }

        public String getCondition() {
            return condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }
        public String getDate_commissioning() {
            return date_commissioning;
        }

        public void setDate_commissioning(String date_commissioning) {
            this.date_commissioning = date_commissioning;
        }

        public String getEstimate_documentation() {
            return estimate_documentation;
        }

        public void setEstimate_documentation(String estimate_documentation) {
            this.estimate_documentation = estimate_documentation;
        }

        public String getParking_place() {
            return parking_place;
        }

        public void setParking_place(String parking_place) {
            this.parking_place = parking_place;
        }

        public String getAccessibility() {
            return accessibility;
        }

        public void setAccessibility(String accessibility) {
            this.accessibility = accessibility;
        }

        public String getSubordination() {
            return subordination;
        }

        public void setSubordination(String subordination) {
            this.subordination = subordination;
        }

        public int getFloors() {
            return floors;
        }

        public void setFloors(int floors) {
            this.floors = floors;
        }

        public Double getCoordinate() {
            return coordinate;
        }

        public void setCoordinate(Double coordinate) {
            this.coordinate = coordinate;
        }

        public Double getCoordinateTwo() {
            return coordinateTwo;
        }

        public void setCoordinateTwo(Double coordinateTwo) {
            this.coordinateTwo = coordinateTwo;
        }
    }
