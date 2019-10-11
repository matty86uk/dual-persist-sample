package com.example.dualpersistsample.service;

import com.example.dualpersistsample.controller.model.CreateFruitRequest;
import com.example.dualpersistsample.entities.Fruit;
import com.example.dualpersistsample.exceptions.FruitDoesNotExistException;
import com.example.dualpersistsample.repository.FruitRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class FruitService {

    private final FruitRepository repository;

    public FruitService(final FruitRepository fruitRepository){
        this.repository = fruitRepository;
    }


    public List<Fruit> getAllFruits(){
        final List<Fruit> fruits = repository.findAll();
        return fruits;
    }

    public Fruit getFruit(final long id){
        final Optional<Fruit> fruit =  repository.findById(id);

        if (fruit.isPresent()){
            return fruit.get();
        }
        throw new FruitDoesNotExistException("Fruit [" + id + "] does not exist");
    }

    @Transactional
    public void createFruit(final CreateFruitRequest request){
        final Fruit fruitToCreate = Fruit.builder()
                .id(request.getId())
                .name(request.getName())
                .colour(request.getColour())
                .quality(request.getQuality())
                .rating(request.getRating())
                .build();

        repository.save(fruitToCreate);
    }

}
