package dev.marvin.service;

import dev.marvin.dto.CustomerRegistrationRequest;
import dev.marvin.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public record UserServiceImpl(UserRepository userRepository) implements UserService {
    @Override
    public void registerCustomer(CustomerRegistrationRequest registrationRequest) {

    }
}
