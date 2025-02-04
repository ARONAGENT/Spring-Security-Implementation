package com.springJourney.Demo_Spring_Security.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class RohanController {

    @GetMapping("/welcome")
    public String authPage() {
        return "welcome to our home page";
    }
}
