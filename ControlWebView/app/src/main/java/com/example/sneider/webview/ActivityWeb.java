package com.example.sneider.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends AppCompatActivity {

    //encapsular datos
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        wv = (WebView)findViewById(R.id.wv);

        //>>recuperamos la URL de la MainActivity
        String url =  getIntent().getStringExtra("sitioWeb");
        //control del navegador a usar DENTRO DE MI APP
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("http://"+url);
    }

    public void cerrar (View vie){
        //termina el activity en el que esta
        finish();
    }
}
