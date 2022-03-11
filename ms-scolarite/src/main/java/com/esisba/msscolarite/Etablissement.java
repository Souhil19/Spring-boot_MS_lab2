package com.esisba.msscolarite;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
public class Etablissement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtablissement;
    private String nom;
    @OneToMany(mappedBy = "etabl")
    private Collection<Etudiant> etudiants;

}
