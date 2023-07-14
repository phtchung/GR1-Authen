package com.example.gr1;

import com.example.gr1.request.RegisterRequest;
import com.example.gr1.service.AuthenticationService;
import com.example.gr1.user.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import static com.example.gr1.user.Role.*;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Gr1Application {

    public static void main(String[] args) {
        SpringApplication.run(Gr1Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AuthenticationService service){
        return args -> {
          var admin = RegisterRequest.builder()
                  .name("Admin")
                  .email("admin@gmail.com")
                  .password("password")
                  .phone("0111199999")
                  .role(ADMIN)
                  .build();
            System.out.println("Admin token : " + service.register(admin).getAccessToken());

            var manager = RegisterRequest.builder()
                    .name("Admin")
                    .email("manager@gmail.com")
                    .password("password")
                    .phone("0111199999")
                    .role(MANAGER)
                    .build();
            System.out.println("Manager token : " + service.register(manager).getAccessToken());
        };
    }
}
