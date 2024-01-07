package com.example.schoolassistant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScheduleActivity extends AppCompatActivity {

    private static final int PERMISSION_REQUEST_CODE = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        Button btnAABack = findViewById(R.id.AABack);
        btnAABack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScheduleActivity.this, EventsActivity.class));
            }
        });

        Button btnAAAdd = findViewById(R.id.AAAdd);
        btnAAAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkCalendarPermissions()) {
                    handleCalendarEvent();
                } else {
                    requestCalendarPermissions();
                }
            }
        });
    }

    private boolean checkCalendarPermissions() {
        int readCalendarPermission = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_CALENDAR);
        int writeCalendarPermission = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_CALENDAR);

        return readCalendarPermission == PackageManager.PERMISSION_GRANTED &&
                writeCalendarPermission == PackageManager.PERMISSION_GRANTED;
    }

    private void requestCalendarPermissions() {
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.READ_CALENDAR, Manifest.permission.WRITE_CALENDAR},
                PERMISSION_REQUEST_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted, handle the calendar event
                handleCalendarEvent();
            } else {
                Toast.makeText(this, "Calendar permissions denied", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void handleCalendarEvent() {
        EditText title = findViewById(R.id.editTextTitle);
        EditText date = findViewById(R.id.editTextDate);
        EditText time = findViewById(R.id.editTextTime);
        EditText location = findViewById(R.id.editTextLocation);
        EditText description = findViewById(R.id.editTextDescription);

        // ... (rest of your code)

        // Check if the necessary fields are not empty
        if (!title.getText().toString().isEmpty()
                && !location.getText().toString().isEmpty()
                && !date.getText().toString().isEmpty()
                && !time.getText().toString().isEmpty()
                && !description.getText().toString().isEmpty()) {
            // ... (rest of your code)
            String dateString = date.getText().toString();
            String timeString = time.getText().toString();

            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm");
            try {
                Date date1 = format.parse(dateString + " " + timeString);
                long startTime = date1.getTime();
                long endTime = startTime + 60 * 60 * 1000; // 1 hour

                Intent intent=new Intent(Intent.ACTION_INSERT);
                intent.setData(CalendarContract.Events.CONTENT_URI);

                intent.putExtra(CalendarContract.Events.TITLE, title.getText().toString());
                intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, startTime);
                intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime);
                intent.putExtra(CalendarContract.Events.EVENT_LOCATION, location.getText().toString());
                intent.putExtra(CalendarContract.Events.DESCRIPTION, description.getText().toString());

                intent.setPackage("com.google.android.calendar");

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Redirecting to Calendar", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ScheduleActivity.this, "Go premium to access this feature.", Toast.LENGTH_SHORT).show();
                }

            } catch (ParseException e) {
                e.printStackTrace();
                Toast.makeText(ScheduleActivity.this, "Please enter a valid date and time", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(ScheduleActivity.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
        }
    }
}
