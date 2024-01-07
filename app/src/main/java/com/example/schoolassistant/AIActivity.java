package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AIActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiactivity);
        btn=findViewById(R.id.AIBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AIActivity.this,StudyMaterials.class));
            }
        });

        Button button11=findViewById(R.id.aitp1);
        Button button22=findViewById(R.id.aitp2);
        Button button33=findViewById(R.id.aitp3);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AIActivity.this,ArtITp1.class);
                startActivity(intent);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AIActivity.this,ArtITp2.class);
                startActivity(intent);
            }
        });

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AIActivity.this,ArtITp3.class);
                startActivity(intent);
            }
        });

    }
}