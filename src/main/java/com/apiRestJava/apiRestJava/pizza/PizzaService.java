package com.apiRestJava.apiRestJava.pizza;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PizzaService {

    private final PizzaRepository pizzaRepository;

    private  final ModelMapper modelMapper;

    public PizzaDTO criarPizza(PizzaDTO dto) {
        Pizza pizza = modelMapper.map(dto, Pizza.class);
        pizzaRepository.save(pizza);
        return modelMapper.map(pizza, PizzaDTO.class);
    }
}
