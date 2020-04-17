package com.example.coronainfo;

public class Transmission  extends CoronaModel{

    private String [] transmission = {"TEST 123", "TEST 1456", "JOY 789"};

    public Transmission(String info){
        super(info);

    }

    public String[] getTransmission() {
        return transmission;
    }

}
