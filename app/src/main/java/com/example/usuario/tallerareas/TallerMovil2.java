package com.example.usuario.tallerareas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TallerMovil2 extends AppCompatActivity {
    private ListView lv;
    private String [] opc;
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller_movil2);
        lv = findViewById(R.id.LVopciones);
        opc = getResources().getStringArray(R.array.opciones_areas);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,opc);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(TallerMovil2.this,Area.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(TallerMovil2.this,Volumen.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(TallerMovil2.this,Operaciones_Realizadas.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }
}
