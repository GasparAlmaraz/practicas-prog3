package com.company.Ejercicio1;

import java.util.Arrays;

public class Libro {

    private String titulo;
    private Autor[] autores;
    private double precio;
    private int stock;


    public Libro(String titulo, Autor[] autor, double precio, int stock) {
        this.titulo = titulo;
        this.autores = autor;
        this.precio = precio;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autores.toString();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String imprimirMsj() {
        StringBuilder nombres = new StringBuilder();

        for (Autor autor : autores) {
            if (autor != null) {
                nombres.append(autor.getNombre());
                nombres.append(" ");
                nombres.append(autor.getApellido());
                nombres.append(" ");
            }
        }

        return "El libro, " + this.titulo + " de " + nombres + ". Se vende a " + this.precio + " pesos.";
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autores=" + Arrays.toString(autores) +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
