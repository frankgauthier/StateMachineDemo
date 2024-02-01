package com.frank.statemachinedemo;

import com.frank.statemachinedemo.model.Events;
import com.frank.statemachinedemo.model.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.Bootstrap;
import org.springframework.statemachine.StateMachine;

import java.io.IOException;

@SpringBootApplication
public class StateMachineDemoApplication  {
    @Autowired
    private StateMachine<States, Events> stateMachine;

    public static void main(String[] args) throws IOException {
        //SpringApplication.run(StateMachineDemoApplication.class, args);
        Bootstrap.main(args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        stateMachine.sendEvent(Events.E1);
//        stateMachine.sendEvent(Events.E2);
//    }
}
