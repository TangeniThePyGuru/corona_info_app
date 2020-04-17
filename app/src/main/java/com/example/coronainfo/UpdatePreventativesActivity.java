package com.example.coronainfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class UpdatePreventativesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_preventatives);
    }

    public void back(View v){
        finish();
        overridePendingTransition(R.anim.back, R.anim.back_outgoing);
    }
}
