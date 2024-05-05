package DesignPatterns.Creational.Singleton;

public class SingletonMain  {
    public static void main(String[] args) {
        System.out.println("Using traditional singleton");

        System.out.println("next serial: " + SerialNumberGeneratorTraditional.VEHICLE.getNextSerial());
        System.out.println("next serial: " + SerialNumberGeneratorTraditional.ENGINE.getNextSerial());
        System.out.println("next serial: " + SerialNumberGeneratorTraditional.VEHICLE.getNextSerial());
        System.out.println("next serial: " + SerialNumberGeneratorTraditional.ENGINE.getNextSerial());
    }
}
