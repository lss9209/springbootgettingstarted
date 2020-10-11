package me.sangseung;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationRunner {

    /*public SampleListener(ApplicationArguments arguments) {
        System.out.println(arguments.containsOption("foo"));
        System.out.println(arguments.containsOption("bar"));
    }*/

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(args.containsOption("foo"));
        System.out.println(args.containsOption("bar"));
    }
}
