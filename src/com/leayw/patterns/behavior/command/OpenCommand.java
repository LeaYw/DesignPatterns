package com.leayw.patterns.behavior.command;

public class OpenCommand implements Command {

    private FileSystemReceiver system;

    public OpenCommand(FileSystemReceiver system) {
        this.system = system;
    }

    @Override
    public void execute() {
        system.openFile();
    }
}
