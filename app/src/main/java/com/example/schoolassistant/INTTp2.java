package com.example.schoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class INTTp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inttp2);

        PDFView pdfView=findViewById(R.id.pdfview2222);
        pdfView.fromAsset("iotTopic2.pdf").load();

    }
}