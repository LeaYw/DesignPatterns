package com.leayw.patterns.behavior.command;

public class WriteComand implements Command {
    private FileSystemReceiver system;

    public WriteComand(FileSystemReceiver system) {
        this.system = system;
    }

    @Override
    public void execute() {
        system.writeFile();
    }
}
