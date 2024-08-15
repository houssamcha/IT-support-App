package com.IT_support_App.IT_support_App.service.Impl;

import com.IT_support_App.IT_support_App.service.EquipementService;
import org.springframework.stereotype.Service;

import com.IT_support_App.IT_support_App.model.Equipement;
import com.IT_support_App.IT_support_App.enums.EtatEquipement;
import com.IT_support_App.IT_support_App.repository.EquipementRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;

@Service
public class EquipementServiceImpl implements EquipementService {

    @Autowired
    private EquipementRepository equipementRepository;

    @Override
    public Equipement saveEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement getEquipementById(Long id) {
        Optional<Equipement> equipement = equipementRepository.findById(id);
        return equipement.orElse(null);
    }

    @Override
    public List<Equipement> getAllEquipements() {
        return equipementRepository.findAll();
    }

    @Override
    public void deleteEquipement(Long id) {
        equipementRepository.deleteById(id);
    }

    @Override
    public void updateEtat(Long id, EtatEquipement etat) {
        Optional<Equipement> equipement = equipementRepository.findById(id);
        if (equipement.isPresent()) {
            Equipement existingEquipement = equipement.get();
            existingEquipement.setEtat(etat);
            equipementRepository.save(existingEquipement);
        }
    }
}
