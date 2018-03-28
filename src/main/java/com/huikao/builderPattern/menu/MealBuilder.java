package com.huikao.builderPattern.menu;

/**
 * Created by admin on 2018/3/6.
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareChikenMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChikenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
