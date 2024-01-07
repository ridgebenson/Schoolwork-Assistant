package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CSTp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cstp2);

        PDFView pdfView=findViewById(R.id.pdfview222);
        pdfView.fromAsset("csTopic2.pdf").load();

    }
}