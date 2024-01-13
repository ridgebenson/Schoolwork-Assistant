package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class IPMTp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipmtp2);

        PDFView pdfView=findViewById(R.id.pdfview22222);
        pdfView.fromAsset("pmTopic2.pdf").load();
    }
}