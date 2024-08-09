package com.IT_support_App.IT_support_App.service.Impl;

import com.IT_support_App.IT_support_App.model.Panne;
import com.IT_support_App.IT_support_App.repository.PanneRepository;
import com.IT_support_App.IT_support_App.service.PanneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PanneServiceImpl implements PanneService {

    @Autowired
    private PanneRepository panneRepository;

    @Override
    public Panne savePanne(Panne panne) {
        return panneRepository.save(panne);
    }

    @Override
    public Panne getPanneById(Long id) {
        Optional<Panne> optionalPanne = panneRepository.findById(id);
        return optionalPanne.orElse(null); // Ou lancer une exception si souhaité
    }

    @Override
    public List<Panne> getAllPannes() {
        return panneRepository.findAll();
    }

    @Override
    public void deletePanne(Long id) {
        panneRepository.deleteById(id);
    }
}
