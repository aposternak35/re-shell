package com.example.demo.config;

import com.example.demo.commands.Data;
import com.example.demo.commands.Day;
import com.example.demo.commands.Exit;
import com.example.demo.commands.Time;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "date")
    public Data getData() {
        return new Data();
    }

    @Bean(name = "day")
    public Day getDay() {
        return new Day();
    }

    @Bean(name = "exit")
    public Exit getExit() {
        return new Exit();
    }

    @Bean(name = "time")
    public Time getTime() {
        return new Time();
    }
}
