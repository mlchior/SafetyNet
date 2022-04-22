package com.openclassrooms.safetynet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**luncher of the application*/

@SpringBootApplication
public class SafetyNetApplication   implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SafetyNetApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World !");
    }

}

