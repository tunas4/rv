package com.example.recycleviewclase.model;

import android.content.Intent;



public class dinosaurio
{
    private String nombre;
    private String tipo;
    private String descripcion;
    private int color;
    private int imagen;

    public dinosaurio(String nombre, String tipo, String descripcion, int color, int imagen)
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.color = color;
        this.imagen = imagen;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public int getColor()
    {
        return color;
    }

    public void setColor(int color)
    {
        this.color = color;
    }

    public int getImagen()
    {
        return imagen;
    }

    public void setImagen(int imagen)
    {
        this.imagen = imagen;
    }
}
