package com.IT_support_App.IT_support_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.IT_support_App.IT_support_App.model.Panne;
import org.springframework.stereotype.Repository;

@Repository
public interface PanneRepository extends JpaRepository<Panne, Long> {

}
