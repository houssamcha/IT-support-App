package com.IT_support_App.IT_support_App.service;

import com.IT_support_App.IT_support_App.model.Personne;
import java.util.List;

public interface PersonneService {
    Personne savePersonne(Personne personne);
    Personne getPersonneById(Long id);
    List<Personne> getAllPersonnes();
    void deletePersonne(Long id);
}
