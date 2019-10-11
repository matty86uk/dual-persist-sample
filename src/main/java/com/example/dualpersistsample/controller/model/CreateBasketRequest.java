package com.example.dualpersistsample.controller.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateBasketRequest {

    private long id;
    private String location;
    private String type;

}
