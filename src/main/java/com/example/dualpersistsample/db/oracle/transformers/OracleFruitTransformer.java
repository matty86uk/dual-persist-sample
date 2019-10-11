package com.example.dualpersistsample.db.oracle.transformers;

import com.example.dualpersistsample.db.oracle.entities.OracleFruit;
import com.example.dualpersistsample.entities.Fruit;
import mat.mat.mat.multirepo.transformer.JpaTransformer;
import org.springframework.stereotype.Component;

@Component
public class OracleFruitTransformer implements JpaTransformer<Fruit, OracleFruit> {
}
