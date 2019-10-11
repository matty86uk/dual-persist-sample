package com.example.dualpersistsample.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Fruit {

    private Long id;
    private Long basketId;
    private String name;
    private String quality;
    private String rating;
    private String colour;

}
