package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class INTTp1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inttp1);

        PDFView pdfView=findViewById(R.id.pdfview1111);
        pdfView.fromAsset("iotTopic1.pdf").load();
    }
}