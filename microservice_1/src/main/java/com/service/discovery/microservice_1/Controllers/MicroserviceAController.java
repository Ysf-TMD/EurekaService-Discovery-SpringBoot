package com.service.discovery.microservice_1.Controllers;


import com.service.discovery.microservice_1.MicroserviceBClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service_a")
public class MicroserviceAController {
    @Autowired
    private MicroserviceBClient microserviceBClient;

    @GetMapping("/call_b")
    public String callMicroserviceB(){

        // return "hello from microservice a " ;
        return microserviceBClient.getGreetingFromB();
    }
    @GetMapping("/")
    public String index(){
        return "Home Microservice A";
    }

}
