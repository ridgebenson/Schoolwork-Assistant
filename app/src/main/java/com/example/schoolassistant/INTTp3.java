package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class INTTp3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inttp3);
        PDFView pdfView=findViewById(R.id.pdfview3333);
        pdfView.fromAsset("iotTopic3.pdf").load();

    }
}