package DesignPatterns.Creational.Command;

public interface FileSystemReceiver {

    void openFile();
    void writeFile();
    void closeFile();
}