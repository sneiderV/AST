package com.example.sneider.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //agrego los objetos que me permiten comunicarme con la parte grafica
    private TextView tv;
    private ListView lv;

    //>>vectores de los elementos a mostrar
    //>se muestra inicialmente
    private String nombres[]={"Clara","Sofi","Ana","Laura","Gabi","Lola","Cup","LoL","Cami","Paula"};
    //>elementos que se muestran en el listView cuando se selecciona
    private String edades[]={"18","25","45","15","18","19","12","25","45","15"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //relacion entre la parte grafica y logica
        tv = (TextView)findViewById(R.id.textView);
        lv = (ListView)findViewById(R.id.lv);

        //arreglo que me permite meter los arreglos del back en el front
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_sv,nombres);
        //permite mostrar lo que esta en adapter
        lv.setAdapter(adapter);

        //manejo los eventos al dar un click en el listview
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv.setText("la edad de "+lv.getItemAtPosition(i)+" es "+edades[i]+" años.");
            }
        });
    }
}
