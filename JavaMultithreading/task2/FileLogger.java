package com.sobirov.task.task2;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        super(level);
        this.level = level;
    }

    @Override
    public void info(String message) {
        System.out.println("Logging to file: " + message);
    }
}