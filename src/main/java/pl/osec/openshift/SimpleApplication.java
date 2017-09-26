package pl.osec.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleApplication {

    public static void main(String[] args) {
        new SpringApplication(SimpleApplication.class)
                .run(args);
    }
}
