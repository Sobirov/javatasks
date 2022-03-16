package com.sobirov.task.task2;

public class SmsLogger extends AbstractLogger {
    public SmsLogger(int level) {
        super(level);
        this.level = level;
    }

    @Override
    public void info(String message) {
        System.out.println("Send SMS to CEO: " + message);
    }
}