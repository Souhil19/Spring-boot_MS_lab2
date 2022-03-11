package com.esisba.msbourse;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Virement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVirement;
    private float montant;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateVirement;

    @ManyToOne
    private Etudiant etudiant;


}
