package com.example.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ingrediente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingrediente);
        Button bz1 =(Button)findViewById(R.id.bz1);
        Button bz2 =(Button)findViewById(R.id.bz2);
        Button bz3 =(Button)findViewById(R.id.bz3);
        Button bz4 =(Button)findViewById(R.id.bz4);
        Button bz5 =(Button)findViewById(R.id.bz5);
        Button bz6 =(Button)findViewById(R.id.bz6);
        Button bz7 =(Button)findViewById(R.id.bz7);
        bz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ingrediente.this, "Lechuga", Toast.LENGTH_LONG).show();

            }
        });
        bz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ingrediente.this, "Frijoles", Toast.LENGTH_LONG).show();

            }
        });
        bz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ingrediente.this, "Crema", Toast.LENGTH_LONG).show();
            }
        });
        bz4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ingrediente.this, "Quesillo", Toast.LENGTH_LONG).show();
            }
        });
        bz5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ingrediente.this, "Queso rallado", Toast.LENGTH_LONG).show();

            }
        });
        bz6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ingrediente.this, "Cancelar", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), Menu.class);
                startActivityForResult(intent, 0);
            }
        });
        bz7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ingrediente.this, "Productos", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), Producto.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}
