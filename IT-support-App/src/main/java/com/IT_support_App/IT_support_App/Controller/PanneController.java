package com.IT_support_App.IT_support_App.Controller;

import com.IT_support_App.IT_support_App.model.Panne;
import com.IT_support_App.IT_support_App.service.PanneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pannes")
public class PanneController {

    @Autowired
    private PanneService panneService;

    @GetMapping
    public List<Panne> getAllPannes() {
        return panneService.getAllPannes();
    }

    @PostMapping
    public Panne createPanne(@RequestBody Panne panne) {
        return panneService.savePanne(panne);
    }

    @GetMapping("/{id}")
    public Panne getPanneById(@PathVariable Long id) {
        return panneService.getPanneById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePanne(@PathVariable Long id) {
        panneService.deletePanne(id);
    }
}
