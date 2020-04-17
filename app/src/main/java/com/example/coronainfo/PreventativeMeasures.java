package com.example.coronainfo;

public class PreventativeMeasures extends CoronaModel {

    private String [] preventativeMeasure = {"TEST 123", "TEST 1456", "JOY 789"};

    public PreventativeMeasures(String info){
        super(info);

    }

    public String[] getPreventativeMeasure() {
        return preventativeMeasure;
    }

}
