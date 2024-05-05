package DesignPatterns.Creational.Builder;

import DesignPatterns.Creational.AbstractCar;
import DesignPatterns.Creational.Vehicle;

public class CarBuilder extends VehicleBuilder{
    private AbstractCar carInProgress;

    public CarBuilder (AbstractCar car) {
        carInProgress = car;
    }

    @Override
    public void buildBody() {
        // add body to carInProgess
        System.out.println("building car body");
    }

    @Override
    public void buildBoot() {
        // Add boot to carInProgress
        System.out.println("building car boot");
    }

    @Override
    public void buildChassis() {
        // Add chassis to carInProgress
        System.out.println("building car chassis");
    }

    @Override
    public void buildPassengerArea() {
        // Add passenger area to carInProgress
        System.out.println("building car passenger area");
    }

    @Override
    public void buildWindows() {
        // Add windows to carInProgress
        System.out.println("building car windows");
    }

    @Override
    public Vehicle getVehicle() {
        return carInProgress;
    }
}
