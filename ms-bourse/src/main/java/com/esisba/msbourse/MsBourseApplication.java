package com.esisba.msbourse;

import com.esisba.msbourse.repositories.EtudiantRepository;
import com.esisba.msbourse.repositories.VirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsBourseApplication implements CommandLineRunner {

	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	VirementRepository virementRepository;

	public static void main(String[] args) {
		SpringApplication.run(MsBourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		etudiantRepository.save(new Etudiant(null, 4555L, 454554F,true,null));
		etudiantRepository.save(new Etudiant(null, 3232L, 45459994F,true,null));
	}
}
