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

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){

    }
    public ArrayList<Vehicle> getVehicleByMakeModel(String make, String model){

    }
    public ArrayList<Vehicle> getVehicleByYear(int min, int max){

    }
    public ArrayList<Vehicle> getVehicleByColor(String color){

    }
    public ArrayList<Vehicle> getVehicleByMileage(int min, int max){

    }
    public ArrayList<Vehicle> getVehicleByType(String vehicleType){

    }
    public ArrayList<Vehicle> getAllVehicles(Vehicle vehicle){

    }
    public void addVehicle(Vehicle vehicle){

    }
    public ArrayList<Vehicle> removeVehicle(Vehicle vehicle){

    }
}
