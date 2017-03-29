package com.vgb.ignite;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootIgniteApplication {

    public static void main(String[] args) {
        try (Ignite ignite = Ignition.start("example-ignite.xml")) {

        }

        SpringApplication.run(SpringBootIgniteApplication.class, args);
    }

}
