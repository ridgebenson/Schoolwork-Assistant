package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PMActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmactivity);
        btn=findViewById(R.id.PMBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PMActivity.this,StudyMaterials.class));
            }
        });

        Button button11111=findViewById(R.id.pmtp1);
        Button button22222=findViewById(R.id.pmtp2);
        Button button33333=findViewById(R.id.pmtp3);

        button11111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PMActivity.this,IPMTp1.class);
                startActivity(intent);
            }
        });

        button22222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PMActivity.this,IPMTp2.class);
                startActivity(intent);
            }
        });

        button33333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PMActivity.this,IPMTp3.class);
                startActivity(intent);
            }
        });

    }
}