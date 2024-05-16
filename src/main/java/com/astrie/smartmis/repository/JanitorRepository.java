package com.astrie.smartmis.repository;

import com.astrie.smartmis.model.Janitors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface JanitorRepository extends JpaRepository<Janitors, Integer> {
    static Map<Object, Object> findJanitorById(int id) {
        return null;
    }

    List<Janitors> findByLname(String lname);
}
