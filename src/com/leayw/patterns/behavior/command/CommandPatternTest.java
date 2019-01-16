package com.leayw.patterns.behavior.command;

public class CommandPatternTest {

    public static void main(String[] args) {
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //creating command and associating with receiver
        OpenCommand openFileCommand = new OpenCommand(fs);

        //Creating invoker and associating with Command

        //perform action on invoker object
        openFileCommand.execute();

        WriteComand writeFileCommand = new WriteComand(fs);
        writeFileCommand.execute();

        CloseCommand closeCommand = new CloseCommand(fs);
        closeCommand.execute();
    }
}
