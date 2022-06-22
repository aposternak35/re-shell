package com.example.demo.commands;

import com.example.demo.commands.Command;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Day implements Command {
    public String getName() {
        return "day";
    }

    public String getHelp() {
        return "show day";
    }

    public void exec(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime()));
    }
}
