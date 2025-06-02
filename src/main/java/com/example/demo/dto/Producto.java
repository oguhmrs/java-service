package com.example.demo.dto;

public class Producto {
    
    private String tipo;
    private String precio;

    public Producto(){

    }

    public Producto(String tipo, String precio) {
        this.tipo = tipo;
        this.precio = precio;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [tipo=" + tipo + ", precio=" + precio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        result = prime * result + ((precio == null) ? 0 : precio.hashCode());
        return result;
    }

}
