package com.example.builder;

public class Car implements Builder {
    private String car;

    @Override
    public void reset() {
        car = "Car ";
    }

    @Override
    public void setSeats(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number of seats must be positive");
        }
        car += "with " + number + " seats, ";
    }

    @Override
    public void setEngine(String engine) {
        car += "powered by " + engine + " ";
    }

    @Override
    public void setTripComputer() {
        car += "with trip computer ";
    }

    @Override
    public void setGPS() {
        car += "and GPS. ";
    }

    public String getResult() {
        return car;
    }
}