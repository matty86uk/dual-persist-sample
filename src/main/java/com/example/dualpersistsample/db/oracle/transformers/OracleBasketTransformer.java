package com.example.dualpersistsample.db.oracle.transformers;

import com.example.dualpersistsample.db.oracle.entities.OracleBasket;
import com.example.dualpersistsample.entities.Basket;
import mat.mat.mat.multirepo.transformer.JpaTransformer;
import org.springframework.stereotype.Component;

@Component
public class OracleBasketTransformer implements JpaTransformer<Basket, OracleBasket> {


}
