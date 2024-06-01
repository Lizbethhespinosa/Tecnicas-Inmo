package com.mycompany.models;

import java.io.Serializable;

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    private String usuario;
    private String documento;
    private String primer_nombre;
    private String primer_apellido;
    private int contrasenha;

    public Cliente() {
    }

    public Cliente(String documento) {
        this.documento = documento;
    }

    public Cliente(String primer_nombre, String primer_apellido, String documento, String usuario, int contrasenha) {
        this.usuario = usuario;
        this.documento = documento;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.contrasenha = contrasenha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public int getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(int contrasenha) {
        this.contrasenha = contrasenha;
    }

}
