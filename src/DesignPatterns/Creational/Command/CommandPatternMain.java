package DesignPatterns.Creational.Command;

public class CommandPatternMain {
    public static void main(String[] args) {
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        openFileCommand.execute();
        FileInvoker openFileInvoker = new FileInvoker(openFileCommand);

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        FileInvoker writeFileInvoker = new FileInvoker(writeFileCommand);

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        FileInvoker closeFileInvoker = new FileInvoker(closeFileCommand);

        openFileInvoker.execute();
        writeFileInvoker.execute();
        closeFileInvoker.execute();

    }
}
