package DesignPatterns.Creational.Factory;

import DesignPatterns.Creational.Vehicle;

public class FactoryMain {
    public static void main(String[] args) {
        // I want an economical car, coloured blue...
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.build(VehicleFactory.DrivingStyle.ECONOMICAL, Vehicle.Colour.BLUE );
        System.out.println(car);

        // I am a "white man van"...
        VehicleFactory vanFactory = new VanFactory();
        Vehicle van = vanFactory.build(VehicleFactory.DrivingStyle.POWERFUL, Vehicle.Colour.WHITE);
        System.out.println(van);
    }
}
