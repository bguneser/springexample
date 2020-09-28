package com.bguneser.aop.api;

import com.bguneser.weblux.entity.User;
import com.bguneser.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    @PostConstruct
    public void init(){
        System.out.println("gggg");
        User user = new User();
        user.setName("Birgun");
        user.setSurname("Guneser");
        user.setAdress("istanbul");
        //user.setBirthDate(Calendar.getInstance().getTime());
        user.setId("k01234");
        userRepository.save(user);
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<User>> getKisi(@PathVariable String search) {
        List<User> kisiler = userRepository.findByNameLikeOrSurnameLike(search, search);
        return ResponseEntity.ok(kisiler);
    }
}
