package com.example.dualpersistsample.db.db2.repositories;

import com.example.dualpersistsample.db.db2.entities.DB2Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DB2FruitRepository extends JpaRepository<DB2Fruit, Long> {
}
