package com.example.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pago extends AppCompatActivity {
EditText ET1,ET2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);
        ET1=(EditText)findViewById(R.id.ET1) ;
        ET2=(EditText)findViewById(R.id.ET2) ;
        Button bot1 =findViewById(R.id.bot1);
        bot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, contraseña;
                usuario = ET1.getText().toString();
                contraseña = ET2.getText().toString();
                if (validar()) {
                    if ("".equals(usuario) || "".equals(contraseña)) {
                        Toast.makeText(pago.this, "Ningun campo debe estar vacio", Toast.LENGTH_LONG).show();
                    }
                    Toast.makeText(pago.this, "Compra exitosa", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(v.getContext(), compraex.class);
                    startActivityForResult(intent, 0);
                }
            }
        });

    }
    public boolean validar(){
        boolean retorno =true;
        String usuario=ET1.getText().toString();
        String Contraseña=ET2.getText().toString();
        if(usuario.isEmpty()){
            ET1.setError("El campo usuario no debe quedar vacio");
            retorno=false;
        }
        if(Contraseña.isEmpty()){
            ET2.setError("El campo contraseña no debe quedar vacio");
            retorno=false;
        }
        return retorno;
    }
}
