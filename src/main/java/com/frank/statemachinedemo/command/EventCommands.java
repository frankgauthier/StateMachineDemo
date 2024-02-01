package com.frank.statemachinedemo.command;

import com.frank.statemachinedemo.model.Events;
import com.frank.statemachinedemo.model.States;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.statemachine.StateMachine;

@Slf4j
//@ShellComponent
public class EventCommands {
//    @Autowired
//    private StateMachine<States, Events> stateMachine;

    @ShellMethod(key = "event1", value = "Send Event 1")
    public void event1() {
        log.info("Sending event 1");
        //stateMachine.sendEvent(Events.E1);
    }

    @ShellMethod(key = "event2", value = "Send Event 2")
    public void event2() {
        log.info("Sending event 2");
        //stateMachine.sendEvent(Events.E2);
    }
}
