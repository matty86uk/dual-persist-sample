package com.example.dualpersistsample.db.db2.transformers;

import com.example.dualpersistsample.entities.Fruit;
import com.example.dualpersistsample.db.db2.entities.DB2Fruit;
import mat.mat.mat.multirepo.transformer.JpaTransformer;
import org.springframework.stereotype.Component;

@Component
public class DB2FruitTransformer implements JpaTransformer<Fruit, DB2Fruit> {
}
