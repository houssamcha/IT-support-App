package com.IT_support_App.IT_support_App.Controller;

import com.IT_support_App.IT_support_App.model.Equipement;
import com.IT_support_App.IT_support_App.service.EquipementService;
import com.IT_support_App.IT_support_App.enums.EtatEquipement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth/admin/equipement")
public class EquipementController {

    @Autowired
    private EquipementService equipementService;

    @GetMapping("/all")
    public List<Equipement> getAllEquipements() {
        return equipementService.getAllEquipements();
    }

    @PostMapping("/add")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return equipementService.saveEquipement(equipement);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }

    @PutMapping("/updateEtat/{id}")
    public void updateEtat(@PathVariable Long id, @RequestBody EtatEquipement etat) {
        equipementService.updateEtat(id, etat);
    }
}
