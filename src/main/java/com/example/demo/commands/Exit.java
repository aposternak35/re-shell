package com.example.demo.commands;

import org.springframework.stereotype.Component;


public class Exit {
    public String getName() {
        return "exit";
    }

    public String getHelp() {
        return "leave console";
    }

    public void exec(String[] args) {
        System.exit(0);
    }
}
