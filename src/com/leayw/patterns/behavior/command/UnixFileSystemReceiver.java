package com.leayw.patterns.behavior.command;

public class UnixFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file in unix OS");
    }

    @Override
    public void writeFile() {
        System.out.println("writing file in unix OS");
    }

    @Override
    public void closeFile() {
        System.out.println("closing file in unix OS");
    }
}
