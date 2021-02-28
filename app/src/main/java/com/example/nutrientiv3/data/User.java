package com.example.nutrientiv3.data;

import java.util.List;
import java.util.Map;

public class User {


    private String uid;
    private String fname;
    private String lname;
    private String email;
    private String phone;



    private int caloriesGoal;
    private int carbGoal;
    private int proteinGoal;
    private int fatGoal;
    private int stepGoal;
    private int streak;

    private List<String> friendUIDs;
    private Map<Integer, Day> calendar;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCaloriesGoal() {
        return caloriesGoal;
    }

    public void setCaloriesGoal(int caloriesGoal) {
        this.caloriesGoal = caloriesGoal;
    }

    public int getCarbGoal() {
        return carbGoal;
    }

    public void setCarbGoal(int carbGoal) {
        this.carbGoal = carbGoal;
    }

    public int getProteinGoal() {
        return proteinGoal;
    }

    public void setProteinGoal(int proteinGoal) {
        this.proteinGoal = proteinGoal;
    }

    public int getFatGoal() {
        return fatGoal;
    }

    public void setFatGoal(int fatGoal) {
        this.fatGoal = fatGoal;
    }

    public int getStepGoal() {
        return stepGoal;
    }

    public void setStepGoal(int stepGoal) {
        this.stepGoal = stepGoal;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public List<String> getFriendUIDs() {
        return friendUIDs;
    }

    public void setFriendUIDs(List<String> friendUIDs) {
        this.friendUIDs = friendUIDs;
    }

    public Map<Integer, Day> getCalendar() {
        return calendar;
    }

    public void setCalendar(Map<Integer, Day> calendar) {
        this.calendar = calendar;
    }


}

