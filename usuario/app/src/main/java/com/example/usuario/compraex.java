package com.example.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Matrix4f;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class compraex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compraex);

        Button bl1 =(Button)findViewById(R.id.bl1);
        Button bl2 =(Button)findViewById(R.id.bl2);

        bl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(compraex.this, "Saliendo", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        bl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(compraex.this, "Opcion", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), opcion.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
