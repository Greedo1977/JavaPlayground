package DesignPatterns.Creational;

public class Saloon extends AbstractCar {
    public Saloon (Engine engine) {
        this(engine, Vehicle.Colour.UNPAINTED);
    }

    public Saloon(Engine engine, Colour colour) {
        super(engine, colour);
    }
}
