package com.example.coronainfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void click(View v){

        Intent intent = null;

        if (v.getId() == R.id.btnSymptoms){
            intent = new Intent(this, SymptomsActivity.class);
        }
        else if (v.getId() == R.id.btnTransmission){
            intent = new Intent(this, TransmisionActivity.class);
        }
        else if (v.getId() == R.id.btnEffects){
            intent = new Intent(this, EffectsActivity.class);
        }
        else if (v.getId() == R.id.btnPrevention){
            intent = new Intent(this, PreventativeActivity.class);
        }
        else if (v.getId() == R.id.btnWhatTodo){
            intent = new Intent(this, WhatTodoActivity.class);
        }

        startActivity(intent);
    }
}
