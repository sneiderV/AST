package com.example.sneider.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //objetos que estoy usando en el Activity
    private EditText etu,etp;

    //registrar
    public void registrar(View view){
        String user = etu.getText().toString();
        String password = etp.getText().toString();

        if(user.isEmpty()){
            Toast.makeText(this,"Ingrese usuario",Toast.LENGTH_SHORT).show();
        }
        if(password.isEmpty()){
            Toast.makeText(this,"Ingrese contraseña",Toast.LENGTH_SHORT).show();
        }
        if(!user.isEmpty() && !password.isEmpty()){
            Toast.makeText(this,"Registro en proceso...",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //relacion de comunicacion de logica con grafica
        etu = (EditText)findViewById(R.id.txt_user);
        etp = (EditText)findViewById(R.id.txt_password);
    }
}
