package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileMan {
    private String FILE_NAME;
    public DealershipFileMan() {
        this.FILE_NAME = "dealership.csv";
    }
    public void saveDealership(Dealership dealership, String FILE_NAME){
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            reader.readLine();
            while((line = reader.readLine()) != null){
                String[] parts = line.split("\\|");
                if(parts.length == 8){
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);
                    double price = Double.parseDouble(parts[7]);
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        };

    }
    public Dealership getDealership(){

    }
}
