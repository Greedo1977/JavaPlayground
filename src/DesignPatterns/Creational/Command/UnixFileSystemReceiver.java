package DesignPatterns.Creational.Command;

public class UnixFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Unix file system open file");
    }

    @Override
    public void closeFile() {
        System.out.println("Unix file systems close file");
    }

    @Override
    public void writeFile() {
        System.out.println("Unix file systems write file");
    }
}
