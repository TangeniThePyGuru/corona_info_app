package com.example.coronainfo;

public class Symptoms extends CoronaModel{

    private String [] symptoms = {"TEST 123", "TEST 1456", "JOY 789"};

    public Symptoms(String info){
        super(info);

    }

    public String[] getSymptoms() {
        return symptoms;
    }

}
