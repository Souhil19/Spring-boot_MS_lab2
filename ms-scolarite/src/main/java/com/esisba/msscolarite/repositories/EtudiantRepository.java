package com.esisba.msscolarite.repositories;

import com.esisba.msscolarite.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
