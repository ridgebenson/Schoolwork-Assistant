package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MobileAppTp1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_app_tp1);

        PDFView pdfView=findViewById(R.id.pdfview1);
        pdfView.fromAsset("maTopic1.pdf").load();
    }
}