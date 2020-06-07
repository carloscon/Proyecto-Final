package com.example.usuario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 =(Button)findViewById(R.id.b1);
        et1=(EditText)findViewById(R.id.et1) ;
        et2=(EditText)findViewById(R.id.et2) ;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, contraseña;
                usuario = et1.getText().toString();
                contraseña = et2.getText().toString();
                if (validar()) {
                    if (usuario.equals("admin") && contraseña.equals("1234")) {

                        Toast.makeText(MainActivity.this, "Ingresando Administrador", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(v.getContext(), opcionadmin.class);
                        startActivityForResult(intent, 0);
                    }
                }if (validare()) {
                    if (usuario.equals("usuario") && contraseña.equals("1234")) {
                        Toast.makeText(MainActivity.this, "Ingresando Usuario", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(v.getContext(), opcion.class);
                        startActivityForResult(intent, 0);
                    }
                }
            }
        });
        }

    public boolean validar(){
        boolean retorno =true;
        String usuario=et1.getText().toString();
        String Contraseña=et2.getText().toString();
        if(usuario.isEmpty()){
            et1.setError("El campo usuario no debe quedar vacio");
            retorno=false;
        }
        if(Contraseña.isEmpty()){
            et2.setError("El campo contraseña no debe quedar vacio");
            retorno=false;
        }
        return retorno;
    }
    public boolean validare(){
        boolean retorno =true;
        String usuario=et1.getText().toString();
        String Contraseña=et2.getText().toString();
        if(usuario.isEmpty()){
            et1.setError("El campo usuario no debe quedar vacio");
            retorno=false;
        }
        if(Contraseña.isEmpty()){
            et2.setError("El campo contraseña no debe quedar vacio");
            retorno=false;
        }
        return retorno;
    }
}
