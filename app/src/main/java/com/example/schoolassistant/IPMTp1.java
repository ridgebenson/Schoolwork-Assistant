package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class IPMTp1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipmtp1);

        PDFView pdfView=findViewById(R.id.pdfview11111);
        pdfView.fromAsset("pmTopic1.pdf").load();

    }
}