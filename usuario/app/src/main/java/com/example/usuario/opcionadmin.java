package com.example.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class opcionadmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcionadmin);
        Button br1 =(Button)findViewById(R.id.br1);
        Button br2 =(Button)findViewById(R.id.br2);
        Button br3 =(Button)findViewById(R.id.br3);
        Button br4 =(Button)findViewById(R.id.br4);

        br1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(opcionadmin.this, "Menu", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), menuad.class);
                startActivityForResult(intent, 0);
            }
        });
        br2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(opcionadmin.this, "Productos", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), productad.class);
                startActivityForResult(intent, 0);
            }
        });
        br3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(opcionadmin.this, "Estadistica", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), estadistica.class);
                startActivityForResult(intent, 0);
            }
        });
        br4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(opcionadmin.this, "Login", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
