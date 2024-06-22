package com.recipeapp.oishiirecipe.Listeners;

import com.recipeapp.oishiirecipe.Models.InstructionsResponse;

import java.util.List;

public interface InstructionsListener {
    void didFetch(List<InstructionsResponse> response, String message);
    void didError(String message);
}
