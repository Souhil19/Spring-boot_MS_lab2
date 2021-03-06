package com.esisba.msbourse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
    @Id
    private Long idEtudiant;
    private Long nCompteCCP;
    private Float salaireParant;
    private Boolean situationImpot;

    @OneToMany(mappedBy = "etudiant")
    private Collection<Virement> virements;
}
