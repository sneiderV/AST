package com.example.sneider.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //crear objeto de lo que estamos usando
    private EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText)findViewById(R.id.txt_web);
    }

    //met. navergar
    public void navegar (View view){
        Intent i = new Intent(this, ActivityWeb.class);
        //enviamos datos de activity a activity
        i.putExtra("sitioWeb",et.getText().toString());
        startActivity(i);
    }

}
