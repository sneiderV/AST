package com.example.sneider.imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //mensaje para boton js
    public void mensajeJs(View view){
        Toast.makeText(this, "Node.JS", Toast.LENGTH_SHORT).show();
    }

    //mensaje para boton react
    public void mensajeReact(View view){
        Toast.makeText(this, "React", Toast.LENGTH_SHORT).show();
    }
}
