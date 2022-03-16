package com.esisba.msformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class MsFormationApplication implements CommandLineRunner {
    @Autowired
    FormationRepository formationRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        formationRepository.save(new Formation(null,"Java",40));
        formationRepository.save(new Formation(null,"React",50));
        formationRepository.save(new Formation(null,"Django",30));


    }
}
