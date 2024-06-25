package dev.marvin.controller;

import dev.marvin.dto.CustomerRegistrationRequest;
import dev.marvin.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
public record UserController(UserService userService) {

    @PostMapping
    public ResponseEntity<Object> registerCustomer(@RequestBody CustomerRegistrationRequest registrationRequest){
        log.info("Registration Request: {}", registrationRequest);

        return null;
    }
}
