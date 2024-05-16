package com.astrie.smartmis.services;

import com.astrie.smartmis.model.Cook;
import com.astrie.smartmis.repository.CookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CookServices {
    @Autowired

    private CookRepository cookRepo;
    private CookServices cookServices;

    public List<Cook> listAll() {
        return cookRepo.findAll();
    }

    public void addCook(Cook cook) {
        cookRepo.save(cook);
    }
}
