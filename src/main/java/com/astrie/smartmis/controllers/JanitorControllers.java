package com.astrie.smartmis.controllers;

import com.astrie.smartmis.model.Janitors;
import com.astrie.smartmis.repository.JanitorRepository;
import com.astrie.smartmis.services.JanitorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:8023/janitors")
public class JanitorControllers {
    @Autowired
private JanitorServices janitorServices;


    @GetMapping("/api/v1/janitors")
    @ResponseStatus(HttpStatus.OK)
    public List<Janitors> getJanitors(){
        return janitorServices.findAllJanitors();
    }


//    @GetMapping("/api/v1/janitors")
//    public Map<Object, Object> findJanitorById(int id) {
//        return JanitorRepository.findJanitorById(id);
//
//    }


    @GetMapping("api/v1/janitors/{janitorid}")
    public void getJanitorWithId(@PathVariable (value="janitorid") Integer janitorid) {
        janitorServices.getJanitorWithId(janitorid);

    }

    @PostMapping("/api/v1/janitors")
    public void registerJanitor(@RequestBody Janitors janitor) {
        janitorServices.addJanitor(janitor);

    }

    @DeleteMapping("/api/v1/janitors")
    public void deleteJanitor(@RequestBody Janitors janitor) {
        janitorServices.deleteJanitor(janitor);
    }

}
