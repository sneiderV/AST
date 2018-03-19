package com.example.sneider.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo button siguiente
    public void siguiente(View view){
        Intent i = new Intent(this, SegundoActivity.class);
        startActivity(i);
    }
}
