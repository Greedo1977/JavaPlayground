package DesignPatterns.Creational.Command;

public class OpenFileCommand implements Command{
    private FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand (FileSystemReceiver fs) {
        this.fileSystemReceiver = fs;
    }

    @Override
    public void execute () {
        this.fileSystemReceiver.openFile();
    }

}
