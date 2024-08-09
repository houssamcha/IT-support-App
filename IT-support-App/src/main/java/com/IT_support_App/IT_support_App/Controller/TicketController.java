package com.IT_support_App.IT_support_App.controller;

import com.IT_support_App.IT_support_App.model.Equipement;
import com.IT_support_App.IT_support_App.service.EquipementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipements")
public class EquipementController {

    @Autowired
    private EquipementService equipementService;

    @GetMapping
    public List<Equipement> getAllEquipements() {
        return equipementService.getAllEquipements();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipement> getEquipementById(@PathVariable Long id) {
        return equipementService.getEquipementById(id);
    }

    @PostMapping
    public Equipement createEquipement(@RequestBody Equipement equipement) {
        return equipementService.createEquipement(equipement);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Equipement> updateEquipement(@PathVariable Long id, @RequestBody Equipement equipementDetails) {
        return equipementService.updateEquipement(id, equipementDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEquipement(@PathVariable Long id) {
        return equipementService.deleteEquipement(id);
    }
}
