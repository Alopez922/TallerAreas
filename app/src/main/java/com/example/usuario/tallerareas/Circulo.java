package com.example.usuario.tallerareas;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by USUARIO on 17/4/2018.
 */

public class Circulo extends AppCompatActivity  {
    private EditText radio;
    private TextView resultado;
    private Resources recursos;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        radio = findViewById(R.id.txtRadioCirculo);
        resultado = findViewById(R.id.lblResultadCuadrado);
        recursos = getResources();
    }

    public void calcular(View v) {
        double rad;
        if(radio.getText().toString().isEmpty()){
            radio.requestFocus();
            radio.setError(getString(R.string.error));
        }else{
            rad = Double.parseDouble(radio.getText().toString());
            String r = String.valueOf(Metodos.circulo(rad));
            resultado.setText(recursos.getText(R.string.resultado).toString() + r);
            Resultados re = new Resultados("Area del circulo","Radio: " + rad,r);
            re.guardar();
        }
    }

    public void borrar(View v){
        resultado.setText("");
        radio.setText("");
    }
}


