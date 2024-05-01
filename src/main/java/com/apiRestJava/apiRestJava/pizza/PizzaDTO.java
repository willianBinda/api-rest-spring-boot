package com.apiRestJava.apiRestJava.pizza;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PizzaDTO {
    private String nome;
    private double preco;
    private boolean disponivel;
    private Sabor sabor;
    private Tamanho tamanho;
}
