package com.company.Ejercicio1;

public class Rectangulo {

    private double ancho;
    private double alto;

    public Rectangulo() {
        this.ancho = 1.0;
        this.alto = 1.0;
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea(){ return (this.ancho * this.alto); }

    public double calcularPerimetro(){ return (this.ancho + this.alto * 2); }
}
