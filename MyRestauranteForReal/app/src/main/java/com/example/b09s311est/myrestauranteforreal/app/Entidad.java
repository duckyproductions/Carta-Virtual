package com.example.b09s311est.myrestauranteforreal.app;

public class Entidad {

    private String Titulo;
    private String Texto;

    public Entidad(String titulo, String texto){
        this.Titulo = titulo;
        this.Texto = texto;
    }

    public String GetTitulo(){return Titulo;}
    public String GetTexto(){return Texto;}
}
