package com.example.coronainfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class PreventativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preventative);
    }

    public void back(View v){
        finish();
        overridePendingTransition(R.anim.back, R.anim.back_outgoing);
    }
}
