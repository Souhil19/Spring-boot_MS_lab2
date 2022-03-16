package com.esisba.msscolarite;

import com.esisba.msscolarite.repositories.EtablissementRepository;
import com.esisba.msscolarite.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsScolariteApplication implements CommandLineRunner {

    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    EtablissementRepository etablissementRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsScolariteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        etudiantRepository.save(new Etudiant(null,"souhil",null,"2CS",null,null,null));
        etudiantRepository.save(new Etudiant(null,"Nasro",null,"2CS",null,null,null));

        etablissementRepository.save(new Etablissement(null,"esi-sba",null));
        etablissementRepository.save(new Etablissement(null,"esi",null));

    }
}
