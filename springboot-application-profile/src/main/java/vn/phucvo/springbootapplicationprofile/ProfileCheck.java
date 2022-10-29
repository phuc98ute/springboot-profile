package vn.phucvo.springbootapplicationprofile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class ProfileCheck {

    @Value("${helloMessage}")
    private String message;

    @PostConstruct
    public void printMessage() {
        System.out.println("Get message from: "+message);
    }
}
