package com.example.nutrientiv3.data;

import java.util.List;

public class Day {


   private List<FoodItem> breakfastList;
   private List<FoodItem> lunchList;
   private List<FoodItem> dinnerList;
   private List<FoodItem> snackList;

   private int steps;
   private int miles;


    public List<FoodItem> getBreakfastList() {
        return breakfastList;
    }

    public void setBreakfastList(List<FoodItem> breakfastList) {
        this.breakfastList = breakfastList;
    }

    public List<FoodItem> getLunchList() {
        return lunchList;
    }

    public void setLunchList(List<FoodItem> lunchList) {
        this.lunchList = lunchList;
    }

    public List<FoodItem> getDinnerList() {
        return dinnerList;
    }

    public void setDinnerList(List<FoodItem> dinnerList) {
        this.dinnerList = dinnerList;
    }

    public List<FoodItem> getSnackList() {
        return snackList;
    }

    public void setSnackList(List<FoodItem> snackList) {
        this.snackList = snackList;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }
}
