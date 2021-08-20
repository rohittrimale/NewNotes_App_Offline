package com.example.notesappoffline.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.notesappoffline.R;
import com.github.barteksc.pdfviewer.PDFView;

public class FullView extends AppCompatActivity {

    String fileName;
    Intent intent;
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_view);


        pdfView=(PDFView)findViewById(R.id.pdfView);
        intent=getIntent();
        fileName=intent.getStringExtra("fileName");

        pdfView.fromAsset(fileName+".pdf").load();
    }
}