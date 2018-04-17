package com.example.usuario.tallerareas;

import java.util.ArrayList;

/**
 * Created by USUARIO on 17/4/2018.
 */

public class Metodos {
    private static ArrayList<Resultados> resultados = new ArrayList();

    public static void guardar(Resultados r){
        resultados.add(r);
    }

    public static ArrayList<Resultados> obtener(){ return resultados; }

    public static double cuadrado(double lado){ return Math.pow(lado, 2); }

    public static double rectangulo (double a, double b){
        return (a*b);
    }

    public static double triangulo (double b, double h){
        return (b*h/2);
    }

    public static double circulo (double r){
        return (Math.PI * Math.pow(r,2));
    }

    public static double esfera (double r){
        return (4/3 * Math.PI * Math.pow(r,3));
    }

    public static double cilindro (double r, double h){
        return (Math.PI * Math.pow(r,2) * h);
    }

    public static double cono (double r, double h){
        return (Math.PI * Math.pow(r,2) * h)/3;
    }

    public static double cubo (double lado){
        return Math.pow(lado, 3);
    }
}
