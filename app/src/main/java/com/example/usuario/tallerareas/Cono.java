package com.example.usuario.tallerareas;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by USUARIO on 17/4/2018.
 */

public class Cono extends AppCompatActivity {
    private EditText radio, altura;
    private TextView resultado;
    private Resources recursos;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);
        radio = findViewById(R.id.txtRadioCono);
        altura = findViewById(R.id.txtAlturaCono);
        resultado = findViewById(R.id.lblResultadCuadrado);
        recursos = getResources();
    }
    public void calcular(View v) {
        double rad, h;
        if(radio.getText().toString().isEmpty()){
            radio.requestFocus();
            radio.setError(getString(R.string.error));
        }else if(altura.getText().toString().isEmpty()){
            altura.requestFocus();
            altura.setError(getString(R.string.error));
        }else{
            rad = Double.parseDouble(radio.getText().toString());
            h = Double.parseDouble(altura.getText().toString());
            String r = String.valueOf(Metodos.cono(rad, h));
            resultado.setText(recursos.getText(R.string.resultado).toString() + r);
            Resultados re = new Resultados("Volumen del cono","Radio: " + rad +", Altura: " + h,r);
            re.guardar();
        }
    }

    public void borrar(View v){
        resultado.setText("");
        radio.setText("");
        altura.setText("");
    }
}