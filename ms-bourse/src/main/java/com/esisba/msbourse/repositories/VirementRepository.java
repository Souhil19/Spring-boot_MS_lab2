package com.esisba.msbourse.repositories;

import com.esisba.msbourse.Virement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VirementRepository extends JpaRepository<Virement,Long> {
}
