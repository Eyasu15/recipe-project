package com.esu.recipeproject.controllers;

import com.esu.recipeproject.services.RecipeService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    IndexController controller;

    @BeforeEach
    public void setUp() throws Exception{

        MockitoAnnotations.initMocks(this);
        controller = new IndexController(recipeService);

    }

    @Test
    void getIndexPage() {

        String viewName = controller.getIndexPage(model);
        assertEquals("index", viewName);
    }
}