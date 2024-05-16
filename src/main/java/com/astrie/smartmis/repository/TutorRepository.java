package com.astrie.smartmis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.astrie.smartmis.model.Tutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Integer> {
}
