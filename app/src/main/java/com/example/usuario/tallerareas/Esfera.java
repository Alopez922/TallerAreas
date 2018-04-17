package com.example.usuario.tallerareas;


import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by USUARIO on 17/4/2018.
 */

public class Esfera extends AppCompatActivity {
    private EditText radio;
    private TextView resultado;
    private Resources recursos;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        radio = findViewById(R.id.txtRadioEsfera);
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
            String r = String.valueOf(Metodos.esfera(rad));
            resultado.setText(recursos.getText(R.string.resultado).toString() + r);
            Resultados re = new Resultados("Volumen de la esfera","Radio: " + rad,r);
            re.guardar();
        }
    }
    public void borrar(View v){
        resultado.setText("");
        radio.setText("");
    }
}