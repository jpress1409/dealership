package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;

    }

    public ArrayList<Vehicle> getVehicleByPrice(double min, double max){
        return inventory;
    }
    public ArrayList<Vehicle> getVehicleByMakeModel(String make, String model){
        return inventory;
    }
    public ArrayList<Vehicle> getVehicleByYear(int min, int max){
        return inventory;
    }
    public ArrayList<Vehicle> getVehicleByColor(String color){
        return inventory;
    }
    public ArrayList<Vehicle> getVehicleByMileage(int min, int max){
        return inventory;
    }
    public ArrayList<Vehicle> getVehicleByType(String vehicleType){
        return inventory;
    }
    public ArrayList<Vehicle> getAllVehicles(Vehicle vehicle){
        return inventory;
    }
    public void addVehicle(Vehicle vehicle){

    }
    public ArrayList<Vehicle> removeVehicle(Vehicle vehicle){
        return inventory;
    }
}
