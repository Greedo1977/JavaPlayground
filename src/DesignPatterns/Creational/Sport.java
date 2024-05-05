package DesignPatterns.Creational;

public class Sport  extends AbstractCar {
    public Sport (Engine engine) {
        this(engine, Vehicle.Colour.UNPAINTED);
    }

    public Sport(Engine engine, Colour colour) {
        super(engine, colour);
    }
}
