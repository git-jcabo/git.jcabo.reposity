package org.jcabo.jcabospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JcaboSpringApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(JcaboSpringApplication.class, args);
        System.out.println("name====" + context.getApplicationName());
        System.out.println("DisplayNam======" + context.getDisplayName());
        System.out.println("id======" + context.getId());

    }

}
