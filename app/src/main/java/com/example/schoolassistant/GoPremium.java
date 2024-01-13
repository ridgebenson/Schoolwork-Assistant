package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoPremium extends AppCompatActivity {

    Button btnGPBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_premium);

        btnGPBack.findViewById(R.id.GPBack);
        btnGPBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GoPremium.this, HomeActivity.class));
            }
        });


    }
}