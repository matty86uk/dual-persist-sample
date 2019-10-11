package com.example.dualpersistsample.controller;

import com.example.dualpersistsample.controller.model.CreateFruitRequest;
import com.example.dualpersistsample.entities.Fruit;
import com.example.dualpersistsample.service.FruitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FruitController {

    private final FruitService fruitService;

    @GetMapping("fruits")
    public @ResponseBody List<Fruit> getFruits(){
        return fruitService.getAllFruits();
    }

    @GetMapping("fruits/{id}")
    public @ResponseBody Fruit getFruit(@PathVariable("id") final long id){
        return fruitService.getFruit(id);
    }

    @PostMapping(value = "fruits", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void createFruits(final @RequestBody CreateFruitRequest request){
        fruitService.createFruit(request);
    }

}
