package com.example.coronainfo;

public class Effects extends CoronaModel{

    private String [] effects = {"TEST 123", "TEST 1456", "JOY 789"};

    public Effects(String info){
        super(info);
    }

    public String[] getEffects() {
        return effects;
    }

}
