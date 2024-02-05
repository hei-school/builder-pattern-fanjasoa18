package com.example.builder;


public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Car suvCar = new Car();
        director.makeSUV(suvCar);
        System.out.println(suvCar.getResult());

        Car sportsCar = new Car();
        director.makeSportsCar(sportsCar);
        System.out.println(sportsCar.getResult());

        CarManual suvManual = new CarManual();
        director.makeSUV(suvManual);
        System.out.println(suvManual.getResult());

        CarManual sportsCarManual = new CarManual();
        director.makeSportsCar(sportsCarManual);
        System.out.println(sportsCarManual.getResult());
    }
}
