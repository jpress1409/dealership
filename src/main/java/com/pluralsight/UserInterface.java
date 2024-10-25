package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    public UserInterface(Dealership dealership) {
        this.dealership = init();
    }
    private static Dealership init(){
        DealershipFileMan fileMan = new DealershipFileMan();
        return fileMan.getDealership();
    }

    public static void userInterface(){
    //Add switch statement for navigation
    }
    public void display(int choice){
        init();
        String make, model, color, vehicleType;

       switch(choice != 99){
           case 1:
               this.dealership.getVehicleByPrice(double PriceMin, double PriceMax);
               break;
           case 2:
               this.dealership.getVehicleByMakeModel(String make, String model);
               break;
           case 3:
               this.dealership.getVehicleByYear(int yearMin, int yearMax);
               break;
           case 4:
               this.dealership.getVehicleByColor(String color);
               break;
           case 5:
               this.dealership.getVehicleByMileage(int mileMin, int mileMax);
               break;
           case 6:
               this.dealership.getVehicleByType(String vehicleType);
               break;
           case 7:
               this.dealership.getAllVehicles(Vehicle vehicle);
               break;
           case 8:
               this.dealership.addVehicle(Vehicle vehicle);
               break;
           case 9:
               this.dealership.removeVehicle(Vehicle vehicle);
               break;
           case 99:
               System.out.println("Invalid Entry");
               Boolean loop = false;
               break;



       }

    }
    public static void processGetByPriceRequest(){

    }
    public static void processGetByMakeModelRequest(){

    }
    public static void processGetByYearRequest(){

    }
    public static void processGetByColorRequest(){

    }
    public static void processGetByMileageRequest(){

    }
    public static void processGetAllVehicleTypeRequest(){

    }
    public static void processAddVehicleRequest(){

    }
    public static void processRemoveVehicleRequest(){

    }
}
