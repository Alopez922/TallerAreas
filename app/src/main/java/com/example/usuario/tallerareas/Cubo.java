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

public class Cubo extends AppCompatActivity {
    private EditText cuadrado;
    private TextView resultado;
    private Resources recursos;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        cuadrado = findViewById(R.id.txtCuadrado);
        resultado = findViewById(R.id.lblResultadCuadrado);
        recursos = getResources();
    }

    public void calcular(View v) {
        double lados;
        if(cuadrado.getText().toString().isEmpty()){
            cuadrado.requestFocus();
            cuadrado.setError(getString(R.string.error));
        }else{
            lados = Double.parseDouble(cuadrado.getText().toString());
            String r = String.valueOf(Metodos.cubo(lados));
            resultado.setText(recursos.getText(R.string.resultado).toString() + r);
            Resultados re = new Resultados("Volumen del cubo","Lado: " + lados,r);
            re.guardar();
        }
    }

    public void borrar(View v){
        resultado.setText("");
        cuadrado.setText("");
    }
}