package DesignPatterns.Creational;

public class BoxVan  extends AbstractVan {
    public BoxVan(Engine engine, Vehicle.Colour colour) {
        super(engine, colour);
    }

    public BoxVan(Engine engine) {
        this (engine, Vehicle.Colour.UNPAINTED);
    }
}
