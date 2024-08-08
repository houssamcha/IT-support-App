package com.IT_support_App.IT_support_App.model;

import com.IT_support_App.IT_support_App.enums.EtatTicket;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;
    private String description;
    private Date dateCreation;

    @Enumerated(EnumType.STRING)
    private EtatTicket etat;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "technicien_id")
    private Technicien technicien;

    @OneToMany(mappedBy = "ticket")
    private List<Panne> pannes;

}

