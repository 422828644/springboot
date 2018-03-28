package com.huikao.builderPattern;

import com.huikao.builderPattern.menu.Meal;
import com.huikao.builderPattern.menu.MealBuilder;

/**
 * Created by admin on 2018/3/6.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("蔬菜套餐");
        vegMeal.showItems();
        System.out.println("总消费: " + vegMeal.getCost());

        Meal chikenMeal = mealBuilder.prepareChikenMeal();
        System.out.println("鸡肉套餐");
        chikenMeal.showItems();
        System.out.println("总消费: " + chikenMeal.getCost());
    }
}
