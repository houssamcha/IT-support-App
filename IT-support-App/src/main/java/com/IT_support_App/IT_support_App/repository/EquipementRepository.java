package com.IT_support_App.IT_support_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.IT_support_App.IT_support_App.model.Equipement;

public interface EquipementRepository extends JpaRepository<Equipement, Long> {
}