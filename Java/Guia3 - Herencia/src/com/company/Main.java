package com.company;

import com.company.Ejercicio1.Cilindro;
import com.company.Ejercicio2.Estudiante;
import com.company.Ejercicio2.Staff;
import com.company.Ejercicio2.Persona;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ejercicio1();
        Ejercicio2();
    }

    public static void Ejercicio1(){

        Cilindro cilindro = new Cilindro();

        System.out.println(cilindro);

        System.out.println();

        Cilindro cilindro1 = new Cilindro(4,"azul",9);

        System.out.println(cilindro1);

        System.out.println(cilindro1.calcularArea());

    }

    public static void Ejercicio2(){

        Estudiante alumno1 = new Estudiante("Pepe", "Pistolas", "42345603", "anashe@hotmail.com",
                                        "Calle Falsa 123", 2010, 2500, "Ingenieria en Fortnite");
        Estudiante alumno2 = new Estudiante("Pedro", "Escopetas", "42345604", "anashe2@hotmail.com",
                "Calle Falsa 124", 2011, 2500, "Ingenieria en Fortnite");
        Estudiante alumno3 = new Estudiante("Justo", "Rifles", "42345605", "anashe3@hotmail.com",
                "Calle Falsa 125", 2012, 2500, "Ingenieria en Fortnite");
        Estudiante alumno4 = new Estudiante("Ramiro", "", "42345606", "anashe44@hotmail.com",
                "Calle Falsa 125", 2013, 2500, "Ingenieria en Fortnite");


        Staff personal1 = new Staff("Roberto","Figoberto","22345660","profeeee@gmail.com",
                "Falsa la Calle 321", 35000.50, 'M');
        Staff personal2 = new Staff("Roberto","Figoberto","22345660","profeeee@gmail.com",
                "Falsa la Calle 321", 35000.50, 'M');
        Staff personal3 = new Staff("Roberto","Figoberto","22345660","profeeee@gmail.com",
                "Falsa la Calle 321", 35000.50, 'M');
        Staff personal4 = new Staff("Roberto","Figoberto","22345660","profeeee@gmail.com",
                "Falsa la Calle 321", 35000.50, 'M');

        Persona[] institucion = new Persona[10];
        institucion[0] = alumno1;
        institucion[1] = alumno2;
        institucion[2] = alumno3;
        institucion[3] = alumno4;
        institucion[4] = personal1;
        institucion[5] = personal2;
        institucion[6] = personal3;
        institucion[7] = personal4;

        int e = 0;
        int s = 0;

        for (Persona persona : institucion) {
            if (persona != null) {
                if (persona instanceof Estudiante) e++;
                if (persona instanceof Staff) s++;
            }
        }

        System.out.println("En la institucion hay " + e + " estudiantes.");
        System.out.println("En la institucion hay " + s + " miembros de staff.");

        double total = 0.0;

        for (Persona persona : institucion) {
            if (persona != null) {
                if (persona instanceof Estudiante) total += ((Estudiante) persona).getCuotaMensual();
            }
        }

        System.out.println("Total cuotas de alumnos " + total + ".-");
    }


}