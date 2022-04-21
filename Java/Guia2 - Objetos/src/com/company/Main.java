package com.company;

import com.company.Ejercicio1.Libro;
import com.company.Ejercicio1.Autor;
import com.company.Ejercicio2.Cliente;
import com.company.Ejercicio2.Factura;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ejercicio1();
        Ejercicio2();
    }

    public static void Ejercicio1(){

        //inciso A y B
        System.out.println("---Inciso A y B---");
        Autor jBloch = new Autor("Joshua","Bloch","joshua@email.com",'M');

        System.out.println(jBloch);
        System.out.println("\n");


        Autor[] autores = new Autor[2];
        autores[0] = jBloch;

        //inciso C y D
        System.out.println("---Inciso C y D---");
        Libro eJava = new Libro("Effective Java", autores, 450, 150);
        System.out.println(eJava);
        System.out.println("\n");

        //inciso E
        eJava.setPrecio(500);
        eJava.setStock(eJava.getStock() + 50);

        //inciso F
        System.out.println("---Inciso F---");
        System.out.println(eJava.getAutor());
        System.out.println("\n");

        //inciso G
        System.out.println("---Inciso G---");
        System.out.println(eJava.imprimirMsj());
        System.out.println("\n");

        //inciso H
        System.out.println("---Inciso H---");
        Autor jLong = new Autor("Josh", "Long", "josh@email.com", 'M');
        System.out.println(jLong);

        autores[1] = jLong;

        Libro eJavaH = new Libro("Effective Java", autores, 500, 150);
        System.out.println(eJavaH);
    }

    public static void Ejercicio2(){

        //inciso B
        Cliente cliente = new Cliente("Pepito Pistolas","nashe@gmail.com",15);

        System.out.println("---Inciso B---");
        System.out.println(cliente);

        //inciso C
        Factura factura = new Factura(2500,cliente);
        System.out.println(factura);

        double descuento = cliente.getDescuento();

        double montoPostDescuento = (factura.getMontoTotal() * descuento) / 100;

        System.out.println("Monto total previo al descuento: " + factura.getMontoTotal());
        System.out.println("Monto total despues del descuento: " + (factura.getMontoTotal() - montoPostDescuento));

    }
}
