package dev.marvin.service;

import dev.marvin.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

class UserServiceImplTest {

    @MockBean
    UserRepository userRepository;

    UserServiceImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new UserServiceImpl(userRepository);
    }

    @Test
    void givenRegistrationRequest_whenRegister_thenDoSth(){
        //given
        //when
        //then
    }
}