package com.app.demo;

import com.app.demo.model.User;
import com.app.demo.repository.UserRespository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

@Component
class addUsers implements CommandLineRunner{

    @Autowired
    private UserRespository userRespository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User();
        user1.setName("Jonh");
        user1.setEmail("john@live.com");
        userRespository.save(user1);

        User user2 = new User();
        user2.setName("Ann");
        user2.setEmail("ann@live.com");
        userRespository.save(user2);
    }
}
