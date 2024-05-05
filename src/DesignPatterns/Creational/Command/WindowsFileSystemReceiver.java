package DesignPatterns.Creational.Command;

public class WindowsFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Windows file system open file");
    }

    @Override
    public void closeFile() {
        System.out.println("Windows file system close file");
    }

    @Override
    public void writeFile() {
        System.out.println("Windows file system write file");
    }
}
