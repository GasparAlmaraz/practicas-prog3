package com.company.Ejercicio2;

public class Staff extends Persona{

    private double salario;
    private char turno;


    public Staff(String nombre, String apellido, String dni, String email, String direccion, double salario, char turno) {
        super(nombre, apellido, dni, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public double salarioAnual(){
        return this.salario * 12;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salario=" + salario +
                ", turno=" + turno +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
