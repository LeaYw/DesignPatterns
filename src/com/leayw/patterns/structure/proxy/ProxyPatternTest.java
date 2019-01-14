package com.leayw.patterns.structure.proxy;


/**
 * Java RMI package user proxy pattern
 */
public class ProxyPatternTest {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("test", "123456");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand("rm abc.pdf");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
