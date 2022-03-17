package com.esisba.msbourse.repositories;

import com.esisba.msbourse.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
