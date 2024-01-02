package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EventsActivity extends AppCompatActivity {
    Button btnEABack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        btnEABack=findViewById(R.id.EABack);
        btnEABack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EventsActivity.this,HomeActivity.class));
            }
        });

        CardView addactivity=findViewById(R.id.scheduleA);
        addactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EventsActivity.this,ScheduleActivity.class));
            }
        });

        CardView viewactivity=findViewById(R.id.viewA);
        viewactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setPackage("com.android.calendar");
                intent.setData(Uri.parse("vnd.android.cursor.item/event"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Go Premium to access this feature.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}