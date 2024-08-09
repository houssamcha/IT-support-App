package com.IT_support_App.IT_support_App.service.Impl;

import com.IT_support_App.IT_support_App.model.Personne;
import com.IT_support_App.IT_support_App.repository.PersonneRepository;
import com.IT_support_App.IT_support_App.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneServiceImpl implements PersonneService {

    @Autowired
    private PersonneRepository personneRepository;

    @Override
    public Personne savePersonne(Personne personne) {
        return personneRepository.save(personne);
    }

    @Override
    public Personne getPersonneById(Long id) {
        Optional<Personne> personne = personneRepository.findById(id);
        return personne.orElse(null); // or throw an exception if preferred
    }

    @Override
    public List<Personne> getAllPersonnes() {
        return personneRepository.findAll();
    }

    @Override
    public void deletePersonne(Long id) {
        personneRepository.deleteById(id);
    }
}
