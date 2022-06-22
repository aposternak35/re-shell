package com.example.demo.commands;

public interface Command {
    String getName();

    String getHelp();

    void exec(String[] args);
}
