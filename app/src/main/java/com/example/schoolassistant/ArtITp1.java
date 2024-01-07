package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ArtITp1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_itp1);

        PDFView pdfView=findViewById(R.id.pdfview11);
        pdfView.fromAsset("aiTopic1.pdf").load();
    }
}