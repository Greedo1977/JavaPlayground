package DesignPatterns.Creational;

public abstract class AbstractCar extends AbstractVehicle {

    public AbstractCar(Engine engine, Vehicle.Colour colour) {
        super(engine, colour);
    }
    public AbstractCar(Engine engine) {
        this(engine, Colour.UNPAINTED);
    }
}
