package com.example.dualpersistsample.repository;

import com.example.dualpersistsample.db.db2.repositories.DB2BasketRepository;
import com.example.dualpersistsample.db.db2.transformers.DB2BasketTransformer;
import com.example.dualpersistsample.db.oracle.repositories.OracleBasketRepository;
import com.example.dualpersistsample.db.oracle.transformers.OracleBasketTransformer;
import com.example.dualpersistsample.entities.Basket;

import mat.mat.mat.multirepo.annotation.MultiRepository;
import org.springframework.data.jpa.repository.JpaRepository;

@MultiRepository(
    jpaRepositories = {OracleBasketRepository.class, DB2BasketRepository.class},
    jpaTransformers = {OracleBasketTransformer.class, DB2BasketTransformer.class}
)
public interface BasketRepository extends JpaRepository<Basket, Long> {

}
