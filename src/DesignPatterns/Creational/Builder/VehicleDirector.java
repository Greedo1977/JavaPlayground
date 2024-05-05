package DesignPatterns.Creational.Builder;

import DesignPatterns.Creational.Vehicle;

public abstract class VehicleDirector {
    public abstract Vehicle build(VehicleBuilder builder);
}
