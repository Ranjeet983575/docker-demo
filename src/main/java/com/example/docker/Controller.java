package com.example.docker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

	Logger log= LoggerFactory.getLogger(Controller.class);

    @GetMapping("/hello")
    public String hello() {
    	log.debug("Hello");
        return "Hello";

    }


}
