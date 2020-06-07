package com.example.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class productad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productad);
        Button b1 =(Button)findViewById(R.id.b1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(productad.this, "Agregar", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), menuad.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}
