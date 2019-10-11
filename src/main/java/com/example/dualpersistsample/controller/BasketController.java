package com.example.dualpersistsample.controller;

import com.example.dualpersistsample.controller.model.CreateBasketRequest;
import com.example.dualpersistsample.entities.Basket;
import com.example.dualpersistsample.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BasketController {

    private final BasketService service;

    @GetMapping("baskets")
    public @ResponseBody List<Basket> getBaskets(){
        return service.getAllBaskets();
    }

    @GetMapping("baskets/{id}")
    public @ResponseBody Basket getBasket(@PathVariable("id") final long id){
        return service.getBasket(id);
    }

    @PostMapping("baskets")
    public void getBasket(@RequestBody CreateBasketRequest request){
        service.createBasket(request);
    }
}
