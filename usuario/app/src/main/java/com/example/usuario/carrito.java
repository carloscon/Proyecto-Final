package com.example.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class carrito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);
        Button bn1 =(Button)findViewById(R.id.bn1);
        Button bn2 =(Button)findViewById(R.id.bn2);


        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(carrito.this, "Pago", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), pago.class);
                startActivityForResult(intent, 0);
            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(carrito.this, "Opcion", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), opcion.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
