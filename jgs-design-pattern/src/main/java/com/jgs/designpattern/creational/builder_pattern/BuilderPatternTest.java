package com.jgs.designpattern.creational.builder_pattern;

import com.jgs.designpattern.creational.builder_pattern.raw.Meal;
import com.jgs.designpattern.creational.builder_pattern.raw.MealBuilder;
import org.junit.Test;

public class BuilderPatternTest {
    @Test
    public void test(){
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.perpareVeMeal();
        System.out.println("Veg Meal---------------");
        vegMeal.showItems();
        System.out.println("Total Cost:" + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("NonVegMeal-------------");
        nonVegMeal.showItems();
        System.out.println("Total Cost:" + nonVegMeal.getCost());
    }
}
