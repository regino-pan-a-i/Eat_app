package com.example.eatdraft;

import java.util.List;

public class Recipe {
    private String name;
    private int prepTime;
    private List<String> ingredients;
    private List<String> procedure;
    private int picture;

    public Recipe(String name, int prepTime, List<String> ingredients, List<String> procedure, int picture) {
        this.name = name;
        this.prepTime = prepTime;
        this.ingredients = ingredients;
        this.procedure = procedure;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public List<String> getProcedure() {
        return procedure;
    }

    public int getPicture() {
        return picture;
    }
}
