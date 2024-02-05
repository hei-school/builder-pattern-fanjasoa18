package com.example.builder;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarBuilderUnitTest {
    private Director director;
    private Car car;
    private CarManual carManual;

    @BeforeEach
    public void setup() {
        director = new Director();
        car = new Car();
        carManual = new CarManual();
    }

    @Test
    public void make_suv_car_ok() {
        director.makeSUV(car);
        assertEquals("Car with 4 seats, powered by SUV Engine with trip computer and GPS. ", car.getResult());

        director.makeSUV(carManual);
        assertEquals("Car Manual with 4 seats, powered by SUV Engine with trip computer and GPS. ", carManual.getResult());
    }

    @Test
    public void make_sports_car_ok() {
        director.makeSportsCar(car);
        assertEquals("Car with 2 seats, powered by Sports Car Engine with trip computer and GPS. ", car.getResult());

        director.makeSportsCar(carManual);
        assertEquals("Car Manual with 2 seats, powered by Sports Car Engine with trip computer and GPS. ", carManual.getResult());
    }

    @Test
    public void reset_test() {
        director.makeSUV(car);
        car.reset();
        assertEquals("Car ", car.getResult());
    }

    @Test
    public void seats_invalid_test() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            car.setSeats(-1);
        });

        String expectedMessage = "Number of seats must be positive";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}
