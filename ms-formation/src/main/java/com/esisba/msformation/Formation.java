package com.esisba.msformation;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idFormation;
    private String nom;
    private int duree;

}
