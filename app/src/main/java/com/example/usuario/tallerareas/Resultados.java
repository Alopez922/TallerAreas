package com.example.usuario.tallerareas;

/**
 * Created by USUARIO on 17/4/2018.
 */

public class Resultados {
    private String operacion;
    private String datos;
    private String resultado;

    public Resultados(String operacion, String datos, String resultado) {
        this.setOperacion(operacion);
        this.setDatos(datos);
        this.setResultado(resultado);
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void guardar(){
        Metodos.guardar(this);
    }

}
