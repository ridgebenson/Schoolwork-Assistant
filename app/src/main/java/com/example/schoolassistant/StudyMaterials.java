package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class StudyMaterials extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_materials);

        CardView exit=findViewById(R.id.cardBack);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudyMaterials.this,HomeActivity.class));
            }
        });

        CardView ad=findViewById(R.id.androidDev);
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudyMaterials.this,AndroidActivity.class));
            }
        });

        CardView ai=findViewById(R.id.artificialIntelligence);
        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudyMaterials.this,AIActivity.class));
            }
        });

        CardView cs=findViewById(R.id.compSecandCry);
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudyMaterials.this,CSActivity.class));
            }
        });

        CardView iot=findViewById(R.id.intOfThs);
        iot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudyMaterials.this,IoTActivity.class));
            }
        });

        CardView pm=findViewById(R.id.projManj);
        pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudyMaterials.this,PMActivity.class));
            }
        });

    }
}