package com.sobirov.task.task2;

public class PhoneLogger extends AbstractLogger {
    public PhoneLogger(int level) {
        super(level);
        this.level = level;
    }

    @Override
    public void info(String message) {
        System.out.println("Call to director: " + message);
    }
}