package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ArtITp3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_itp3);
        PDFView pdfView=findViewById(R.id.pdfview33);
        pdfView.fromAsset("aiTopic3.pdf").load();
    }
}