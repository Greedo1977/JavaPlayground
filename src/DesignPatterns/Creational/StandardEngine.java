package DesignPatterns.Creational;

public class StandardEngine extends AbstractEngine {
    public StandardEngine(int size) {
        super(size, false); // not turbo
    }
}
