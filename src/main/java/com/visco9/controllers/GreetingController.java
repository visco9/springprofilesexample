package com.visco9.controllers;

import com.visco9.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by x on 2/11/2017.
 */
@Controller
public class GreetingController {
    private HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello() {
        String r = helloWorldService.getGreeting();
        System.out.println(r);
        return r;
    }
}
