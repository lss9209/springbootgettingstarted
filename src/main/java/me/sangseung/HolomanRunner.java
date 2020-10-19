package me.sangseung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class HolomanRunner implements ApplicationRunner {

    @Autowired
    Holoman holoman;

    @Autowired
    SangseungProperties sangseungProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=================================");
        System.out.println(sangseungProperties.getFullName());
        System.out.println(sangseungProperties.getAge());
        System.out.println(sangseungProperties.getSessionTimeout());
        System.out.println("=================================");
    }
}
