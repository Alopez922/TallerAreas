package com.example.usuario.tallerareas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



/**
 * Created by USUARIO on 17/4/2018.
 */

public class Volumen extends AppCompatActivity {
    private ListView lv;
    private String [] opc;
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumenes);
        lv = findViewById(R.id.LVVolumenes);
        opc = getResources().getStringArray(R.array.opciones_volumenes);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,opc);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(Volumen.this,Esfera.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(Volumen.this,Cilindro.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(Volumen.this,Cono.class);
                        startActivity(in);
                        break;
                    case 3:
                        in = new Intent(Volumen.this,Cubo.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }
}