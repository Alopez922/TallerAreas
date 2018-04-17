package com.example.usuario.tallerareas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USUARIO on 17/4/2018.
 */

public class Operaciones_Realizadas extends AppCompatActivity {
    private ArrayList<Resultados> resultados;
    private TableLayout tabla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacionesrealizadas);

        resultados = Metodos.obtener();
        tabla = findViewById(R.id.tabla);

        for (int i = 0; i < resultados.size() ; i++) {

            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText(""+(i+1));
            c2.setText(resultados.get(i).getOperacion());
            c3.setText(resultados.get(i).getDatos());
            c4.setText(resultados.get(i).getResultado());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            tabla.addView(fila);
        }

    }
}
