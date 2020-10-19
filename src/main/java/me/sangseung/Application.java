package me.sangseung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new PortListener());
        app.run(args);
    }
    @Bean
    public Holoman holoman() {
        Holoman holoman = new Holoman();
        holoman.setName("ddddd");
        holoman.setHowLong(18);
        return holoman;
    }



}
