package com.leayw.patterns.behavior.command;

public class CloseCommand implements Command {
    private FileSystemReceiver system;

    public CloseCommand(FileSystemReceiver system) {
        this.system = system;
    }

    @Override
    public void execute() {
        system.closeFile();
    }
}
