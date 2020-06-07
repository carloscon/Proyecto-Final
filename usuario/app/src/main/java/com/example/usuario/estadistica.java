package com.example.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class estadistica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadistica);
        Button bm1 =(Button)findViewById(R.id.bm1);
        Button bm2 =(Button)findViewById(R.id.bm2);
        Button bm3 =(Button)findViewById(R.id.bm3);
        Button bm4 =(Button)findViewById(R.id.bm4);
        final TextView textView =findViewById(R.id.tv);
        bm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("dia");
            }
        });
        bm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("mes");
            }
        });
        bm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("año");
            }
        });
        bm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(estadistica.this, "Saliendo", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
