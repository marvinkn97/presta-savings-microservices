package dev.marvin.service;

import dev.marvin.dto.CustomerRegistrationRequest;

public interface UserService {
    void registerCustomer(CustomerRegistrationRequest registrationRequest);
}
