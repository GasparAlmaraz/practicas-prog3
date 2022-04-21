package com.company.Ejercicio1;

public class Cilindro extends Circulo{

    private double altura;



    public Cilindro() {
        super();
        altura = 1.0;
    }

    public Cilindro(double area, String color, double altura) {
        super(area, color);
        this.altura = altura;
    }



    public double getAltura() {
        return altura;
    }

    public double calcularVolumen(){
        return super.calcularArea() * this.altura;
    }

    @Override
    public double calcularArea() {
        return Math.PI * 2 * this.radio * this.altura + 2 * super.calcularArea();
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                ", radio=" + radio +
                ", color='" + color + '\'' +
                ", volumen=" + calcularVolumen() +
                ", subclase de=" + super.toString() +
                '}';
    }
}
