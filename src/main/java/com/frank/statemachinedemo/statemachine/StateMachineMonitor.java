package com.frank.statemachinedemo.statemachine;

import com.frank.statemachinedemo.model.Events;
import com.frank.statemachinedemo.model.States;
import lombok.extern.slf4j.Slf4j;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.monitor.AbstractStateMachineMonitor;
import org.springframework.statemachine.transition.Transition;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Slf4j
public class StateMachineMonitor extends AbstractStateMachineMonitor<States, Events> {

    @Override
    public void transition(StateMachine<States, Events> stateMachine,
                           Transition<States, Events> transition,
                           long duration) {

        log.info("Transition: {} took {} ms", transition, duration);
    }

    @Override
    public void action(StateMachine<States, Events> stateMachine,
                       Function<StateContext<States, Events>, Mono<Void>> action, long duration) {
        log.info("Action: {} took {} ms", stateMachine, duration);
    }
}
