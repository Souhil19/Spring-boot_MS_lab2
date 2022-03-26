package com.esisba.msscolarite;

import com.esisba.msscolarite.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ScolariteAPI {
    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    FormationProxy formationProxy;

    @GetMapping("etudiant/{id}/formation")
    Etudiant getEtudiantWithFormation(@PathVariable("id")Long ide){
        Etudiant etudiant= etudiantRepository.findById(ide).get();
        etudiant.setFormation(formationProxy.getFormation(etudiant.getIdFormation()));
        return etudiant;
    }
}
