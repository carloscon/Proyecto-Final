package com.example.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class opcion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion);
        Button bt4 =(Button)findViewById(R.id.bt4);
        Button bt1 =(Button)findViewById(R.id.bt1);
        Button bt2 =(Button)findViewById(R.id.bt2);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(opcion.this, "Menu", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), Menu.class);
                startActivityForResult(intent, 0);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(opcion.this, "Producto", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), Producto.class);
                startActivityForResult(intent, 0);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(opcion.this, "Regresando", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(v.getContext(), MainActivity.class);
                    startActivityForResult(intent, 0);
                }
        });
    }
}
