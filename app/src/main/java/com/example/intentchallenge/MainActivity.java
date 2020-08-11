package com.example.intentchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHealthActivity = findViewById(R.id.btn_health_activity);
        btnHealthActivity.setOnClickListener(this);

        Button btnCucitanganActivity = findViewById(R.id.btn_cucitangan_activity);
        btnCucitanganActivity.setOnClickListener(this);

        Button btnMaskerActivity = findViewById(R.id.btn_masker_activity);
        btnMaskerActivity.setOnClickListener(this);

        Button btnHealthylifeActivity = findViewById(R.id.btn_healthylife_activity);
        btnHealthylifeActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_health_activity:
                Intent moveIntent = new Intent(MainActivity.this, HealthActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_cucitangan_activity:
                Intent moveIntent2 = new Intent(MainActivity.this, CucitanganActivity.class);
                startActivity(moveIntent2);
                break;
            case R.id.btn_masker_activity:
                Intent moveIntent3 = new Intent(MainActivity.this, MaskerActivity.class);
                startActivity(moveIntent3);
                break;
            case R.id.btn_healthylife_activity:
                Intent moveIntent4 = new Intent(MainActivity.this, HealthylifeActivity.class);
                startActivity(moveIntent4);
                break;
        }
    }
}