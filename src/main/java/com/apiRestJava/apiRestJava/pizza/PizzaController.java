package com.apiRestJava.apiRestJava.pizza;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pizzas")
@RequiredArgsConstructor
public class PizzaController {
    private final PizzaService pizzaService;

    @PostMapping
    public void cadastrar(@RequestBody PizzaDTO dto){
        pizzaService.criarPizza(dto);
    }

}
