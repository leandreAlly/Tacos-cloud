package com.allycode.tacos;

import lombok.Data;

import java.util.List;

@Data
public class Taco {
    private String name;

    private List<Ingredients> ingredients;
}