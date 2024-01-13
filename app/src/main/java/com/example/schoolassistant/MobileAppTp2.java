package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MobileAppTp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_app_tp2);

        PDFView pdfView=findViewById(R.id.pdfview2);
        pdfView.fromAsset("maTopic2.pdf").load();
    }
}