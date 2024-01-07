package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MobileAppTp3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_app_tp3);
        PDFView pdfView=findViewById(R.id.pdfview3);
        pdfView.fromAsset("maTopic3.pdf").load();
    }
}