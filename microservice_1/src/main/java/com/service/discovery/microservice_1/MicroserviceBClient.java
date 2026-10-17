package com.service.discovery.microservice_1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name="microservice-b")
public interface MicroserviceBClient {
    @GetMapping("/service-b/greeting")
    String getGreetingFromB();
}
