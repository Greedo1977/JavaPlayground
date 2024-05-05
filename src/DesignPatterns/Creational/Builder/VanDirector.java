package DesignPatterns.Creational.Builder;

import DesignPatterns.Creational.Vehicle;

public class VanDirector extends VehicleDirector {
    public Vehicle build(VehicleBuilder builder) {
        builder.buildChassis();
        builder.buildBody();
        builder.buildReinforcedStorageArea();
        builder.buildWindows();

        return builder.getVehicle();
    }
}
