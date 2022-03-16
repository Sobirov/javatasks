package com.sobirov.task.task2;

public interface Logger {
    void inform(String message, int level);

    void setNext(Logger next);

    void info(String message);
}