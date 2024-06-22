package com.recipeapp.oishiirecipe.Listeners;

import com.recipeapp.oishiirecipe.Models.SimilarRecipeResponse;

import java.util.List;

public interface SimilarRecipesListener {
    void didFetch(List<SimilarRecipeResponse> response, String message);
    void didError(String message);
}
