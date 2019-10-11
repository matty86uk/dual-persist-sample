package com.example.dualpersistsample.db.oracle.repositories;

import com.example.dualpersistsample.db.oracle.entities.OracleBasket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OracleBasketRepository extends JpaRepository<OracleBasket, Long> {
}
