package com.sobirov.task.task2;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        super(level);
        this.level = level;
    }

    @Override
    public void info(String message) {
        System.out.println("Logging to console: " + message);
    }
}