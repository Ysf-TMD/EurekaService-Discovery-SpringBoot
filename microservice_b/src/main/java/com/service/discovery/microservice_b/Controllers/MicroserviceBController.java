package com.service.discovery.microservice_b.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-b")
public class MicroserviceBController {
    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello from Microservice b ";
    }

}
