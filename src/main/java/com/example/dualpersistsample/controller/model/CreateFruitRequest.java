package com.example.dualpersistsample.controller.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateFruitRequest {

    private long id;
    private String name;
    private String quality;
    private String rating;
    private String colour;

}
