package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AndroidActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        btn=findViewById(R.id.mobappBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(AndroidActivity.this,StudyMaterials.class));
            }
        });

        Button button1=findViewById(R.id.matp1);
        Button button2=findViewById(R.id.matp2);
        Button button3=findViewById(R.id.matp3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AndroidActivity.this,MobileAppTp1.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AndroidActivity.this,MobileAppTp2.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AndroidActivity.this,MobileAppTp3.class);
                startActivity(intent);
            }
        });

    }
}