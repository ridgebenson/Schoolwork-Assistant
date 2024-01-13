package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CSActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csactivity);
        btn=findViewById(R.id.CSBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CSActivity.this,StudyMaterials.class));
            }
        });

        Button button111=findViewById(R.id.cstp1);
        Button button222=findViewById(R.id.cstp2);
        Button button333=findViewById(R.id.cstp3);

        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CSActivity.this,CSTp1.class);
                startActivity(intent);
            }
        });

        button222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CSActivity.this,CSTp2.class);
                startActivity(intent);
            }
        });

        button333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CSActivity.this,CSTp3.class);
                startActivity(intent);
            }
        });

    }
}