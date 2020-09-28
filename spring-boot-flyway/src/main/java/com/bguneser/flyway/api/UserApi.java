package com.bguneser.flyway.api;

import com.bguneser.flyway.entity.User;
import com.bguneser.flyway.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserApi {

    private final UserRepository userRepository;

    @GetMapping
   List<User> getAll(){

       return userRepository.findAll();

    }
}
