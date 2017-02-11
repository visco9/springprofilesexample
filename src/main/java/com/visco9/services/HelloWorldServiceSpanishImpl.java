package com.visco9.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by x on 2/11/2017.
 */
@Component
@Profile("spanish")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hola Mundo.";
    }
}
