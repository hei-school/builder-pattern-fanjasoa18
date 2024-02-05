package com.example.builder;


public class Director {
    void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("SUV Engine");
        builder.setTripComputer();
        builder.setGPS();
    }

    void makeSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("Sports Car Engine");
        builder.setTripComputer();
        builder.setGPS();
    }
}
