package com.example.coronainfo;

public class WhatToDo extends CoronaModel{

    private String [] whatTodos = {"TEST 123", "TEST 1456", "JOY 789"};

    public WhatToDo(String info){
        super(info);

    }

    public String[] getWhatTodos() {
        return whatTodos;
    }

}
