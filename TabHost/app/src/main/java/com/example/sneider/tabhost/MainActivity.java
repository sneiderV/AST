package com.example.sneider.tabhost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    TabHost th;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        th = (TabHost)findViewById(R.id.tabHost);

        //Tab 1
        th.setup();
        TabHost.TabSpec ts1=th.newTabSpec("Tab1");
        ts1.setIndicator("Bienvenido");
        ts1.setContent(R.id.tab1);
        th.addTab(ts1);

        //Tab 2
        th.setup();
        TabHost.TabSpec ts2=th.newTabSpec("Tab2");
        ts1.setIndicator("Contenido");
        ts1.setContent(R.id.tab2);
        th.addTab(ts2);

        //Tab 3
        th.setup();
        TabHost.TabSpec ts3=th.newTabSpec("Tab3");
        ts1.setIndicator("Despedida");
        ts1.setContent(R.id.tab3);
        th.addTab(ts3);

    }


}
