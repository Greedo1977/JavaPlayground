package DesignPatterns.Creational.Singleton;

public enum SerialNumberGeneratorTraditional {

    VEHICLE, ENGINE;

    private int count;
    // instance methods
    public synchronized  int getNextSerial() {
        return ++count;
    }
}
