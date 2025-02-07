package com.spring.security.test.SpringSecurityTest.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/admin")
    public ResponseEntity<String> adminUser(){
        return ResponseEntity.ok("Yes,I am Admin");
    }
    @GetMapping("/superadmin")
    public ResponseEntity<String> superAdminUser(){
        return ResponseEntity.ok("Yes,I am SuperAdmin");
    }
}
