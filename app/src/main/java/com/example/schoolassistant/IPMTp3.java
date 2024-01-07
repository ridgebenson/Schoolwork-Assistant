package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class IPMTp3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipmtp3);

        PDFView pdfView=findViewById(R.id.pdfview33333);
        pdfView.fromAsset("pmTopic3.pdf").load();
    }
}