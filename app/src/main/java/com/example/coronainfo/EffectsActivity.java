package com.example.coronainfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EffectsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_effects);
    }

    public void back(Void v){
        finish();
        overridePendingTransition(R.anim.back, R.anim.back_outgoing);
    }
}
