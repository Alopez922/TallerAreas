package com.example.usuario.tallerareas;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by USUARIO on 17/4/2018.
 */

public class Rectangulo extends AppCompatActivity {
    private EditText ladoA, ladoB;
    private TextView resultado;
    private Resources recursos;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        ladoA = findViewById(R.id.txtLadoA);
        ladoB = findViewById(R.id.txtLadoB);
        resultado = findViewById(R.id.lblResultadCuadrado);
        recursos = getResources();
    }

    public void calcular(View v) {
        double ladoa, ladob;
        if(ladoA.getText().toString().isEmpty()){
            ladoA.requestFocus();
            ladoA.setError(getString(R.string.error));
        }else if(ladoB.getText().toString().isEmpty()){
            ladoB.requestFocus();
            ladoB.setError(getString(R.string.error));
        }else{
            ladoa = Double.parseDouble(ladoA.getText().toString());
            ladob = Double.parseDouble(ladoB.getText().toString());
            String r = String.valueOf(Metodos.rectangulo(ladoa, ladob));
            resultado.setText(recursos.getText(R.string.resultado).toString() + r);
            Resultados re = new Resultados("Area del rectángulo","lado A: " + ladoa + ", lado B:" + ladob,r);
            re.guardar();
        }
    }

    public void borrar(View v){
        resultado.setText("");
        ladoA.setText("");
        ladoB.setText("");
    }
}