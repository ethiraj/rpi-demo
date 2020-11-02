package com.ethiraj.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();
//
//    @GetMapping("/hello")
//    public Greeting hello(@RequestParam(value = "namejava", defaultValue = "World") String name) {
//        System.out.println("Rest Controller---->");
//
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
//    }

    @GetMapping("/multi_arch")
    public String multi_arch(@RequestParam(value = "namejava", defaultValue = "World") String name) {
        //this is just quick one line code to show the runtime environments
        String runenv = "<h2>Docker Multi-arch build</h2><br><h3>Spring boot application running in...</h3><br><b> OS : </b>" +    System.getProperty("os.name") +" <br><b> Version : </b>"+System.getProperty("os.version") +"<br><b>Architecture : </b>"+System.getProperty("os.arch");
        return runenv;
    }
}