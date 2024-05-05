package DesignPatterns.Creational.Factory;

import DesignPatterns.Creational.*;

public class VanFactory extends VehicleFactory {

    @Override
    protected Vehicle selectVehicle(DrivingStyle style) {
        if ( (style == DrivingStyle.ECONOMICAL) ||
              style == DrivingStyle.MIDRANGE) {
            return new Pickup(new StandardEngine(2200));
        }
        else {
            return new BoxVan(new TurboEngine(2500));
        }
    }
}
