package com.reto3;

import com.reto3.repository.crud.GadgetCrudInterface;
import com.reto3.repository.crud.OrderCrudInterface;
import com.reto3.repository.crud.UserCrudInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto3Application implements CommandLineRunner {
    @Autowired
    private GadgetCrudInterface gadgetInterface;
    @Autowired
    private UserCrudInterface userInterface;
    @Autowired
    private OrderCrudInterface orderInterface;
    public static void main(String[] args) {
        SpringApplication.run(Reto3Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        gadgetInterface.deleteAll();
        userInterface.deleteAll();
        orderInterface.deleteAll();
    }
}
