package com.astrie.smartmis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.astrie.smartmis.model.Cook;
import org.springframework.stereotype.Repository;


@Repository
public interface CookRepository extends JpaRepository<Cook, Integer> {
}
