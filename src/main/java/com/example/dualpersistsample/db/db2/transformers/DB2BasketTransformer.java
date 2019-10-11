package com.example.dualpersistsample.db.db2.transformers;

import com.example.dualpersistsample.db.db2.entities.DB2Basket;
import com.example.dualpersistsample.entities.Basket;
import mat.mat.mat.multirepo.transformer.JpaTransformer;
import org.springframework.stereotype.Component;

@Component
public class DB2BasketTransformer implements JpaTransformer<Basket, DB2Basket> {
}
