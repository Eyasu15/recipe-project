package com.esu.recipeproject.repositories;

import com.esu.recipeproject.domain.Ingredient;
import com.esu.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    Iterable<Recipe> findAll();
    Optional<Recipe> findById(Long id);
}
