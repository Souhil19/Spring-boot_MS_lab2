package com.esisba.msformation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface FormationRepository extends JpaRepository<Formation,Long> {

}
