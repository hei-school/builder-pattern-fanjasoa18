package com.example.builder;


class CarManual implements Builder {
    private String manual;

    @Override
    public void reset() {
        manual = "Car Manual ";
    }

    @Override
    public void setSeats(int number) {
        manual += "with " + number + " seats, ";
    }

    @Override
    public void setEngine(String engine) {
        manual += "powered by " + engine + " ";
    }

    @Override
    public void setTripComputer() {
        manual += "with trip computer ";
    }

    @Override
    public void setGPS() {
        manual += "and GPS. ";
    }

    // Get the result (Manual)
    public String getResult() {
        return manual;
    }
}
