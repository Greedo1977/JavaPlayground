package DesignPatterns.Creational.Builder;

import DesignPatterns.Creational.AbstractVan;
import DesignPatterns.Creational.Vehicle;

public class VanBuilder extends VehicleBuilder {
    private AbstractVan vanInProgress;

    public VanBuilder(AbstractVan van) {
        vanInProgress = van;
    }

    @Override
    public void buildBody() {
        // Add body to vanInProgress
        System.out.println("building van body");
    }

    @Override
    public void buildChassis() {
        // Add chassis to vanInProgress
        System.out.println("building van chassis");
    }

    @Override
    public void buildReinforcedStorageArea() {
        // Add storage area  to vanInProgress
        System.out.println("building van storage area");
    }

    @Override
    public void buildWindows() {
        // Add Windows to vanInProgress
        System.out.println("building van windows");
    }

    @Override
    public Vehicle getVehicle() {
        return vanInProgress;
    }
}
