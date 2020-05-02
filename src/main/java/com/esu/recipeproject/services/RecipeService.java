package com.esu.recipeproject.services;

import com.esu.recipeproject.domain.Recipe;

import java.util.Optional;
import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Optional<Recipe> getRecipeById(Long id);
}
