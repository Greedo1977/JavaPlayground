package DesignPatterns.Creational;

public class Coupe extends AbstractCar {
    public Coupe(Engine engine, Vehicle.Colour colour) {
        super(engine, colour);
    }

    public Coupe(Engine engine) {
        this(engine, Colour.UNPAINTED);
    }
}
