package com.example.demo;

import com.example.demo.commands.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;

@Configuration

class ShellManager {
    @Autowired
    private Set<Command> commands;

    public void exec() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print(">");
            String[] cmd = in.nextLine().trim().split(" ");
            for (Command command : commands) {
                if (command.getName().equals(cmd[0])) {
                    command.exec(cmd);
                }
            }
        }
    }
}
public class Starter {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.example.demo");
        applicationContext.getBean(ShellManager.class).exec();
    }
}
