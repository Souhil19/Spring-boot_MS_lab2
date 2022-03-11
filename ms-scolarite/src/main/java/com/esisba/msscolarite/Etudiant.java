package com.esisba.msscolarite;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nom;
    private Date dateN;

    private String promo;
    private Date dateInscription;
    @ManyToOne
    private Etablissement etabl;
    private Long idFormation;

}
