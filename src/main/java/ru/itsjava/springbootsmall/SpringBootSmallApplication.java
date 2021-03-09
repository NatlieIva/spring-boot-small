package ru.itsjava.springbootsmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.itsjava.springbootsmall.service.ServiceForPets;

@SpringBootApplication
public class SpringBootSmallApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootSmallApplication.class, args);
        System.out.println(context.getBean(ServiceForPets.class).getService());

    }

}
