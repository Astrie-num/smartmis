package com.astrie.smartmis.controllers;

import com.astrie.smartmis.model.Cook;
import com.astrie.smartmis.services.CookServices;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:8023/cooks")
public class CookControllers {
    @Autowired
    private CookServices cookServices;

    @PostMapping
    public void addCook(@RequestBody Cook cook) {
        cookServices.addCook(cook);
    }

    @GetMapping("/cook")
    public List<Cook> getAllCooks() {
        return cookServices.listAll();
    }
}
