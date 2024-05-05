package DesignPatterns.Creational.Factory;

import DesignPatterns.Creational.*;

public class CarFactory  extends VehicleFactory {
    @Override
    protected Vehicle selectVehicle(DrivingStyle style) {
        if (style == DrivingStyle.ECONOMICAL) {
            return new Saloon(new StandardEngine(1300));
        } else if (style == DrivingStyle.MIDRANGE) {
            return  new Saloon(new StandardEngine(1600));
        } else {
            return new Sport(new TurboEngine(2000));
        }
    }
}
