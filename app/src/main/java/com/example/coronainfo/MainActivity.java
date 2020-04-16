package com.example.coronainfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v){
        Intent intent;
        if(R.id.btnReadInfo == v.getId()){
            intent = new Intent(this, Dashboard.class);
        } else {
            intent = new Intent(this, UpdateDashboardActivity.class);
        }
        startActivity(intent);
    }
}
