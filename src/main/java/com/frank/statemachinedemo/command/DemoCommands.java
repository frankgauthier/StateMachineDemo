package com.frank.statemachinedemo.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

//@ShellComponent
public class DemoCommands {
    @ShellMethod(key = "hello", value = "Says hello")
    public String hello(@ShellOption(defaultValue = "World") String name) {
        return "Hello " + name + "!";
    }
}
