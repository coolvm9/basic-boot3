package com.fusioninc.springlesson1.basic.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/service1")
    public String service1(){
        return "Service1";
    }
}
