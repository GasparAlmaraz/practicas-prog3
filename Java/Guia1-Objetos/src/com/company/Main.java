package com.company;

import java.util.Scanner;
import com.company.Ejercicio1.Rectangulo;
import com.company.Ejercicio2.Empleado;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Ejercicio1();
        Ejercicio2();
    }

    public static void Ejercicio1(){
        Scanner lectura = new Scanner(System.in);

        System.out.println("==== Ejercicio 1 ==== \n");
        System.out.println("Ingrese Alto.");
        double altoIngresado = lectura.nextDouble();
        System.out.println("Ingrese Ancho.");
        double anchoIngresado = lectura.nextDouble();
        Rectangulo rectangulo = new Rectangulo(anchoIngresado, altoIngresado);
        System.out.println("La altura es: " + rectangulo.getAlto());
        System.out.println("La anchura es: " + rectangulo.getAncho());

        System.out.println("\nEl area es: " + rectangulo.calcularArea());
        System.out.println("El perimetro es: " + rectangulo.calcularPerimetro());

        Rectangulo rectanguloDefault = new Rectangulo();
        System.out.println("\nLa altura del rectangulo default es: " + rectanguloDefault.getAlto());
        System.out.println("La base del rectangulo default es: " + rectanguloDefault.getAncho());
    }

    public static void Ejercicio2(){
        System.out.println("\n==== Ejercicio 2 ==== \n");
        Empleado carlosG = new Empleado(23456345, "Carlos", "Gutierrez", 25000);
        Empleado anaS = new Empleado(34234123, "Ana", "Sanchez", 27500);

        System.out.println(carlosG.getEmpleado());
        System.out.println(anaS.getEmpleado());

        carlosG.aumentarSalario(15);
        System.out.println("\nEl salario anual de " + carlosG.getNombre()+ " " + carlosG.getApellido() +" es, " + carlosG.calcularSalarioAnual());
    }
}
