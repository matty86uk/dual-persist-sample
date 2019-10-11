package com.example.dualpersistsample.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Basket {

    private Long id;
    private String location;
    private String type;
    private List<Fruit> fruits;
}
