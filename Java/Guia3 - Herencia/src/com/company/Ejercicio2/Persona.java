package com.company.Ejercicio2;

public class Persona{
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String email;
    protected String direccion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, String email, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.direccion = direccion;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
