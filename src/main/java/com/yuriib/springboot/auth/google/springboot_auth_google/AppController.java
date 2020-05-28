package com.yuriib.springboot.auth.google.springboot_auth_google;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/notrestricted")
    public String getMessageFromNotRestrictedEndpoint() {
        return "Hello from not restricted endpoint! ";
    }

    @GetMapping("/restricted")
    public String getMessageFromRestrictedEndpoint(){
        return "Hello from restricted endpoint! ";
    }
}
