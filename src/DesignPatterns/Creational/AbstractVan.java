package DesignPatterns.Creational;

public abstract class AbstractVan extends AbstractVehicle {

    public AbstractVan(Engine engine, Vehicle.Colour colour) {
        super(engine, colour);
    }

    public AbstractVan(Engine engine) {
        this(engine, Colour.UNPAINTED);
    }
}