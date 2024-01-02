package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IoTActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_io_tactivity);
        btn=findViewById(R.id.intBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IoTActivity.this,StudyMaterials.class));
            }
        });

        Button button1111=findViewById(R.id.iottp1);
        Button button2222=findViewById(R.id.iottp2);
        Button button3333=findViewById(R.id.iottp3);

        button1111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IoTActivity.this,INTTp1.class);
                startActivity(intent);
            }
        });

        button2222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IoTActivity.this,INTTp2.class);
                startActivity(intent);
            }
        });

        button3333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IoTActivity.this,INTTp3.class);
                startActivity(intent);
            }
        });

    }
}