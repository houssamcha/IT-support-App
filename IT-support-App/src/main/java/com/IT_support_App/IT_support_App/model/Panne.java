package com.IT_support_App.IT_support_App.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



import java.util.List;

@Getter
@Setter
@Entity
public class Panne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long panneId;
    private String description;

    @OneToMany(mappedBy  = "panne")
    private List<Ticket> tickets;
    
}
