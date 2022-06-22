package com.example.demo.commands;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Time {
    public String getName() {
        return "time";
    }

    public String getHelp() {
        return "show time";
    }

    public void exec(String[] args) {
        System.out.println(LocalTime.now());
    }
}
