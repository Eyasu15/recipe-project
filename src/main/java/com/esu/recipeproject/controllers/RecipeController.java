package com.esu.recipeproject.controllers;

import com.esu.recipeproject.services.RecipeService;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @RequestMapping("/recipes/show/recipe={id}")
    String recipe(Model model, @PathVariable Long id){
        model.addAttribute("recipe",recipeService.getRecipeById(id));
        model.addAttribute("ingredients", recipeService.getRecipeById(id).get().getIngredients());
        return "recipe/show";
    }
}
