package com.IT_support_App.IT_support_App.repository;

import com.IT_support_App.IT_support_App.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}

