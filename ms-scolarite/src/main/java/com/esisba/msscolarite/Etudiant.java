package com.esisba.msscolarite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nom;
    private Date dateN;

    private String promo;

    @Temporal(TemporalType.DATE)
    private Date dateInscription;
    @ManyToOne
    private Etablissement etablissement;
    private Long idFormation;

    @Transient
    private Formation formation;

}
