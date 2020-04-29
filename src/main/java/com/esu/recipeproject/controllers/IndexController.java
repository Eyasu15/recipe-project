package com.esu.recipeproject.controllers;

import com.esu.recipeproject.domain.Category;
import com.esu.recipeproject.domain.Ingredient;
import com.esu.recipeproject.domain.Recipe;
import com.esu.recipeproject.domain.UnitOfMeasure;
import com.esu.recipeproject.repositories.CategoryRepository;
import com.esu.recipeproject.repositories.RecipeRepository;
import com.esu.recipeproject.repositories.UnitOfMeasureRepository;
import com.esu.recipeproject.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}