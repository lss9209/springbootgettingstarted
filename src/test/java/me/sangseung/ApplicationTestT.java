package me.sangseung;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:/test.properties")

public class ApplicationTestT {

    @Value("${sangseung.name}")
    private String name;

    @Autowired
    Environment environment;

    @Test
    public void contextLoads() {
        System.out.println(name);
        assertThat(environment.getProperty("sangseung.name")).isEqualTo("sangseung2");
    }
}
