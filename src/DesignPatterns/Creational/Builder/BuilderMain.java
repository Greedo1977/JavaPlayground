package DesignPatterns.Creational.Builder;

import DesignPatterns.Creational.AbstractCar;
import DesignPatterns.Creational.Saloon;
import DesignPatterns.Creational.StandardEngine;
import DesignPatterns.Creational.Vehicle;

public class BuilderMain {
    public static void main(String[] args) {
        AbstractCar car = new Saloon(new StandardEngine(1300));
        VehicleBuilder builder = new CarBuilder(car);
        VehicleDirector director = new CarDirector();
        Vehicle v = director.build(builder);
        System.out.println(v);


    }
}
