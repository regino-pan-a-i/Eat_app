package com.example.eatdraft;

import java.util.List;

public class Recipes {
    private final String name;
    private final int prepTime;
    private final List<String> ingredients;
    private final String procedure;
    private final int picture;

    public Recipes(String name, int prepTime, List<String> ingredients, String procedure, int picture) {
        this.name = name;
        this.prepTime = prepTime;
        this.ingredients = ingredients;
        this.procedure = procedure;
        this.picture = picture;
    }

    // getters and setters for each attribute
    public String getName(){
        return name;
    }
    public int getPrepTime(){
        return prepTime;
    }
    public List<String> getIngredients(){
        return ingredients;
    }
    public String getProcedure() {
        return procedure;
    }
    public int getPicture() {
        return picture;
    }

    // Add setter for user recipe creation
}
