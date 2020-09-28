package com.bguneser.aop.api;

import com.bguneser.entitiy.User;
import com.bguneser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    private UserRepository userRepository ;

    @PostConstruct
    public void init(){
        System.out.println("bbbbb");
        User user = new User();
        user.setName("birgun");
        user.setSurname("guneser");
        userRepository.save(user);
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user){

        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> ListUsers(User user){

        return ResponseEntity.ok(userRepository.findAll());
    }
}
