package com.example.demo.commands;

import com.example.demo.commands.Command;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Data implements Command {
    public String getName() {
        return "date";
    }

    public String getHelp() {
        return "show date";
    }

    public void exec(String[] args) {
        System.out.println(LocalDate.now());
    }
}
