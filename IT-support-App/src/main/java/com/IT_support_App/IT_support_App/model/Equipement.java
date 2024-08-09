package com.IT_support_App.IT_support_App.model;

import com.IT_support_App.IT_support_App.enums.EtatEquipement;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equipementId;
    private String nom;
    private String type;

    @Enumerated(EnumType.STRING)
    private EtatEquipement etat;

    @OneToMany(mappedBy = "equipement")
    private List<Panne> pannes;
}
