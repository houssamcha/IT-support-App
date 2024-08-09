package com.IT_support_App.IT_support_App.service;

import com.IT_support_App.IT_support_App.enums.EtatEquipement;
import com.IT_support_App.IT_support_App.model.Equipement;
import java.util.List;

public interface EquipementService {
    Equipement saveEquipement(Equipement equipement);
    Equipement getEquipementById(Long id);
    List<Equipement> getAllEquipements();
    void deleteEquipement(Long id);
    void updateEtat(Long id, EtatEquipement etat);
}
