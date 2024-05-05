package DesignPatterns.Creational.Builder;

import DesignPatterns.Creational.Vehicle;

public class CarDirector extends VehicleDirector {
    public Vehicle build(VehicleBuilder builder) {
        builder.buildChassis();
        builder.buildBody();
        builder.buildPassengerArea();
        builder.buildBoot();
        builder.buildWindows();
        return builder.getVehicle();
    }
}
