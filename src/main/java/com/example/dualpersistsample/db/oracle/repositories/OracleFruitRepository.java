package com.example.dualpersistsample.db.oracle.repositories;

import com.example.dualpersistsample.db.oracle.entities.OracleFruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OracleFruitRepository extends JpaRepository<OracleFruit, Long> {

    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM PNET.FRUIT")
    int getAllFruits();

    Optional<OracleFruit> findById(final long id);

}


