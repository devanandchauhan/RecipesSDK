package com.devanand.library;

import java.util.ArrayList;

public class RecipeModel {

    private String name;
    private IngredientModel ingredients;
    private ArrayList<String> steps;
    private ArrayList<Integer> timers;
    private String imageURL;

    public RecipeModel(String name, IngredientModel ingredients, ArrayList<String> steps, ArrayList<Integer> timers, String imageURL) {
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
        this.timers = timers;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IngredientModel getIngredients() {
        return ingredients;
    }

    public void setIngredients(IngredientModel ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<String> steps) {
        this.steps = steps;
    }

    public ArrayList<Integer> getTimers() {
        return timers;
    }

    public void setTimers(ArrayList<Integer> timers) {
        this.timers = timers;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
