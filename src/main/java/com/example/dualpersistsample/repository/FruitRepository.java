package com.example.dualpersistsample.repository;

import com.example.dualpersistsample.db.db2.repositories.DB2FruitRepository;
import com.example.dualpersistsample.db.db2.transformers.DB2FruitTransformer;
import com.example.dualpersistsample.db.oracle.repositories.OracleFruitRepository;
import com.example.dualpersistsample.db.oracle.transformers.OracleFruitTransformer;
import com.example.dualpersistsample.entities.Fruit;
import mat.mat.mat.multirepo.annotation.MultiRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@MultiRepository(
                jpaRepositories = {OracleFruitRepository.class, DB2FruitRepository.class},
                jpaTransformers = {OracleFruitTransformer.class, DB2FruitTransformer.class}
        )
public interface FruitRepository extends JpaRepository<Fruit, Long> {

    int getFruitCount();

    Optional<Fruit> findById(final long id);

}
