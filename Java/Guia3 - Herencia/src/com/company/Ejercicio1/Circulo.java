package com.company.Ejercicio1;

public class Circulo {
    protected double radio;
    protected String color;



    Circulo(){
        this.radio = 1.0;
        this.color = "rojo";
    }

    Circulo(double radio, String color){
        this.radio = radio;
        this.color = color;
    }


    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    public double calcularArea(){
        return Math.pow(this.radio,2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
