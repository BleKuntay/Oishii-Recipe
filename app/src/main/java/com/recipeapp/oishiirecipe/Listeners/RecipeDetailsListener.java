package com.recipeapp.oishiirecipe.Listeners;

import com.recipeapp.oishiirecipe.Models.RecipeDetailsResponse;
import com.recipeapp.oishiirecipe.RecipeDetailsActivity;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailsResponse response, String message);
    void didError(String message);

}
