package com.recipeapp.oishiirecipe.Listeners;

import com.recipeapp.oishiirecipe.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RandomRecipeApiResponse response, String message);
    void didError(String message);
}
