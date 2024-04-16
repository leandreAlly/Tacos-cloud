package com.tacos;

import com.tacos.data.IngredientRepository;
import org.springframework.core.convert.converter.Converter;

public class IngredientByIdConverter implements Converter<String, Ingredient> {
    private IngredientRepository ingredientRepo;

    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }
}
