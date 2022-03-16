package com.esisba.msscolarite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etablissement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtablissement;
    private String nom;
    @OneToMany(mappedBy = "etabl")
    private Collection<Etudiant> etudiants;

}
