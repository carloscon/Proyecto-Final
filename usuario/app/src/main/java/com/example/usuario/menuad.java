package com.example.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class menuad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuad);
        ImageButton imag = findViewById(R.id.img);
        ImageButton i1 = findViewById(R.id.i1);
        ImageButton i2 = findViewById(R.id.i2);
        ImageButton i3 = findViewById(R.id.i3);
        ImageButton i4 = findViewById(R.id.i4);
        ImageButton i5 = findViewById(R.id.i5);
        ImageButton i6 = findViewById(R.id.i6);
        ImageButton i7 = findViewById(R.id.i7);
        ImageButton i8 = findViewById(R.id.i8);
        ImageButton i9 = findViewById(R.id.i9);
        ImageButton i10 = findViewById(R.id.i10);
        Button e1 =findViewById(R.id.e1);
        Button e2 =findViewById(R.id.e2);
        Button e3 =findViewById(R.id.e3);
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(menuad.this, "Agregar", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), productad.class);
                startActivityForResult(intent, 0);
            }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(menuad.this, "Quitar", Toast.LENGTH_LONG).show();

            }
        });
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(menuad.this, "Menu administrador", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), opcionadmin.class);
                startActivityForResult(intent, 0);
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(menuad.this, "Queso", Toast.LENGTH_LONG).show();

            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(menuad.this, "Chicharron", Toast.LENGTH_LONG).show();

            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(menuad.this, "Tinga de Pollo", Toast.LENGTH_LONG).show();

            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(menuad.this, "Tinga de Res", Toast.LENGTH_LONG).show();

            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(menuad.this, "Huitlacoche", Toast.LENGTH_LONG).show();

            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(menuad.this, "Sesos", Toast.LENGTH_LONG).show();

            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(menuad.this, "Hongos", Toast.LENGTH_LONG).show();

            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(menuad.this, "Panza", Toast.LENGTH_LONG).show();

            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(menuad.this, "Flor de calabaza", Toast.LENGTH_LONG).show();

            }
        });
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(menuad.this, "Picadillo", Toast.LENGTH_LONG).show();

            }
        });
    }
}
