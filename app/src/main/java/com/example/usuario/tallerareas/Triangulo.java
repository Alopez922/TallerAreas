package com.example.usuario.tallerareas;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by USUARIO on 17/4/2018.
 */

public class Triangulo extends AppCompatActivity {
    private EditText base, altura;
    private TextView resultado;
    private Resources recursos;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        base = findViewById(R.id.txtBaseTriangulo);
        altura = findViewById(R.id.txtAlturaTriangulo);
        resultado = findViewById(R.id.lblResultadCuadrado);
        recursos = getResources();
    }

    public void calcular(View v) {
        double h, b;
        if(altura.getText().toString().isEmpty()){
            altura.requestFocus();
            altura.setError(getString(R.string.error));
        }else if(base.getText().toString().isEmpty()){
            base.requestFocus();
            base.setError(getString(R.string.error));
        }else{
            h = Double.parseDouble(altura.getText().toString());
            b = Double.parseDouble(base.getText().toString());
            String r = String.valueOf(Metodos.triangulo(b, h));
            resultado.setText(recursos.getText(R.string.resultado).toString() + r);
            Resultados re = new Resultados("Area del triángulo","Base: " + b + ", Altura: " + h,r);
            re.guardar();
        }
    }

    public void borrar(View v){
        resultado.setText("");
        base.setText("");
        altura.setText("");
    }
}
