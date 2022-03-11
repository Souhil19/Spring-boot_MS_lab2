package com.esisba.msbourse;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Etudiant {
    @Id
    private Long idEtudiant;
    private Long nCompteCCP;
    private Float salaireParant;
    private Boolean situationImpot;

    @OneToMany(mappedBy = "etudiant")
    private Collection<Virement> virements;
}
