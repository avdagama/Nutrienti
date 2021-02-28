package com.example.nutrientiv3.data;

public class FoodItem {

    private  String foodName;
    private  int defualtServ;
    private  int portion;
    private  String units;
    private int calories;
    private int carbs;
    private int fat;
    private int protein;


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getDefualtServ() {
        return defualtServ;
    }

    public void setDefualtServ(int defualtServ) {
        this.defualtServ = defualtServ;
    }

    public int getPortion() {
        return portion;
    }

    public void setPortion(int portion) {
        this.portion = portion;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

}
