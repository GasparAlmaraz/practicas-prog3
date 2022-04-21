package com.company.Ejercicio2;

public class Estudiante extends Persona{

    private int anioIngreso;
    private double cuotaMensual;
    private String carrera;


    public Estudiante() {
        super();
    }

    public Estudiante(String nombre, String apellido, String dni, String email, String direccion, int anioIngreso, double cuotaMensual, String carrera) {
        super(nombre, apellido, dni, email, direccion);
        this.anioIngreso = anioIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "anioIngreso=" + anioIngreso +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
