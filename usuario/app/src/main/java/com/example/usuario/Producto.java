package com.example.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Producto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        Button btn1 =(Button)findViewById(R.id.btn1);
        Button btn2 =(Button)findViewById(R.id.btn2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Producto.this, "Carrito", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), carrito.class);
                startActivityForResult(intent, 0);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Producto.this, "Menu", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), Menu.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
