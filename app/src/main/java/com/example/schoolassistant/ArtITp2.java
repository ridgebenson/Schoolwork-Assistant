package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ArtITp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_itp2);
        PDFView pdfView=findViewById(R.id.pdfview22);
        pdfView.fromAsset("aiTopic2.pdf").load();
    }
}