package com.IT_support_App.IT_support_App.service;

import com.IT_support_App.IT_support_App.model.Panne;
import java.util.List;

public interface PanneService {
    Panne savePanne(Panne panne);
    Panne getPanneById(Long id);
    List<Panne> getAllPannes();
    void deletePanne(Long id);
}
