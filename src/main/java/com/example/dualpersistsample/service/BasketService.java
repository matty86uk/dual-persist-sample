package com.example.dualpersistsample.service;

import com.example.dualpersistsample.controller.model.CreateBasketRequest;
import com.example.dualpersistsample.controller.model.CreateFruitRequest;
import com.example.dualpersistsample.entities.Basket;
import com.example.dualpersistsample.entities.Fruit;
import com.example.dualpersistsample.exceptions.BasketDoesNotExistException;
import com.example.dualpersistsample.repository.BasketRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class BasketService {

    private final BasketRepository repository;

    public BasketService (final BasketRepository basketRepository){
        this.repository = basketRepository;
    }


    public List<Basket> getAllBaskets(){
        return repository.findAll();
    }

    public Basket getBasket(final long id) {
        final Optional<Basket> basket = repository.findById(id);

        if (basket.isPresent()){
            return basket.get();
        }
        throw new BasketDoesNotExistException("Basket [" + id + "] does not exist");
    }

    @Transactional
    public void createBasket(final CreateBasketRequest request){
        final Basket basketToCreate = Basket.builder()
                .id(request.getId())
                .location(request.getLocation())
                .type(request.getType())
                .build();

        repository.save(basketToCreate);
    }

//    @Transactional
//    public void test(){
//
//        final List<Fruit> fruits = Arrays.asList(
//                Fruit.builder()
//                        .id(5L)
//                        .basketId(1L)
//                        .name("AppleX")
//                        .quality("GoodX")
//                        .rating("5 StarX")
//                        .colour("GreenX")
//                .build(),
//                Fruit.builder()
//                        .id(6L)
//                        .basketId(1L)
//                        .name("OrangeX")
//                        .quality("OKX")
//                        .rating("4 StarX")
//                        .colour("OrangeX")
//                .build()
//        );
//
//        final Basket basket = Basket.builder()
//                .id(3L)
//                .location("kitchenX")
//                .type("strawX")
//                .fruits(fruits)
//                .build();
//
//        repository.save(basket);
//
//    }
}
