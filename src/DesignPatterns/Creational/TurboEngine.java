package DesignPatterns.Creational;

public class TurboEngine extends AbstractEngine {
    public TurboEngine(int size) {
        super(size, true); // is turbo
    }
}