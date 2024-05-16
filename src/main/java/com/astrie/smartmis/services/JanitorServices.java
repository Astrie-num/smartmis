package com.astrie.smartmis.services;

import com.astrie.smartmis.model.Janitors;
import com.astrie.smartmis.repository.JanitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class JanitorServices {
    @Autowired
    private JanitorRepository janitorRepository;
    private JanitorServices janitorServices;

    public void addJanitor(Janitors janitor) {
        janitorRepository.save(janitor);
    }

    public List<Janitors> findAllJanitors() {
        return janitorRepository.findAll();
    }

    public List<Janitors> findAllUsingLastName(String lname) {
        return janitorRepository.findByLname(lname);
    }


    public void deleteJanitor(Janitors janitor) {
    }

    public void getJanitorWithId(Integer janitorId) {
    }
}

