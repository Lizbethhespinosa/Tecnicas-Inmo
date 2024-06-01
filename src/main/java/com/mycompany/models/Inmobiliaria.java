package com.mycompany.models;

import java.io.Serializable;

public class Inmobiliaria implements Serializable {
    private static final long serialVersionUID = 1L;

    private int matricula_inmueble;
    private String tipo;
    private String pais;
    private String direccion;
    private String descripcion;
    private double precio;

    public Inmobiliaria() {
    }

    public Inmobiliaria(int matricula_inmueble) {
        this.matricula_inmueble = matricula_inmueble;
    }

    public Inmobiliaria(int matricula_inmueble, String tipo, String pais, String direccion, String descripcion,
            double precio) {
        this.matricula_inmueble = matricula_inmueble;
        this.tipo = tipo;
        this.pais = pais;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getMatricula_inmueble() {
        return matricula_inmueble;
    }

    public void setMatricula_inmueble(int matricula_inmueble) {
        this.matricula_inmueble = matricula_inmueble;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
