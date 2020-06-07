package com.example.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ImageButton imag = findViewById(R.id.img);
        ImageButton im1 = findViewById(R.id.im1);
        ImageButton im2 = findViewById(R.id.im2);
        ImageButton im3 = findViewById(R.id.im3);
        ImageButton im4 = findViewById(R.id.im4);
        ImageButton im5 = findViewById(R.id.im5);
        ImageButton im6 = findViewById(R.id.im6);
        ImageButton im7 = findViewById(R.id.im7);
        ImageButton im8 = findViewById(R.id.im8);
        ImageButton im9 = findViewById(R.id.im9);
        ImageButton im10 = findViewById(R.id.im10);
        imag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Menu.this, "Producto", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), ingrediente.class);
                startActivityForResult(intent, 0);
            }
        });
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Menu.this, "Queso", Toast.LENGTH_LONG).show();

            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Menu.this, "Chicharron", Toast.LENGTH_LONG).show();

            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Menu.this, "Tinga de Pollo", Toast.LENGTH_LONG).show();

            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Menu.this, "Tinga de Res", Toast.LENGTH_LONG).show();

            }
        });
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Menu.this, "Huitlacoche", Toast.LENGTH_LONG).show();

            }
        });
        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Menu.this, "Sesos", Toast.LENGTH_LONG).show();

            }
        });
        im7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Menu.this, "Hongos", Toast.LENGTH_LONG).show();

            }
        });
        im8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Menu.this, "Panza", Toast.LENGTH_LONG).show();

            }
        });
        im9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Menu.this, "Flor de calabaza", Toast.LENGTH_LONG).show();

            }
        });
        im10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Menu.this, "Picadillo", Toast.LENGTH_LONG).show();

            }
        });

    }
}
