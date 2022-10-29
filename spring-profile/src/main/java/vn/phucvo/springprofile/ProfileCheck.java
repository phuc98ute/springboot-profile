package vn.phucvo.springprofile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class ProfileCheck {
    @Value("${helloMessage}")
    private String message;

    @PostConstruct
    public void printMessage() {
        System.out.println("Welcome message from "+message);
    }
}
