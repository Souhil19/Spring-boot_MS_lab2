package com.esisba.msformation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsFormationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }

}
