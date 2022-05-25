package org.ada.algoritmoslineales;

import java.util.Scanner;

public class EstructuraDeControl {
    public void identificarNumeroMayor() {
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("Ingrese número A");
        int numeroA = lectorDatos.nextInt();
        System.out.println("Ingrese número B");
        int numeroB = lectorDatos.nextInt();
        int numeroMayor;

        if (numeroA > numeroB) {
            numeroMayor = numeroA;
        } else {
            numeroMayor = numeroB;
        }
        System.out.println("El número mayor es:" + numeroMayor);
    }

    public void identificarPositivoNegativo() {
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("ingrese un número");
        int numero = lectorDatos.nextInt();
        if (numero >= 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }

    public void calcularValorLapices() {
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de lápices");
        int cantLapices = lectorDatos.nextInt();
        int precioTotal;

        if (cantLapices <= 1000) {
            precioTotal = cantLapices * 85;
        } else {
            precioTotal = cantLapices * 90;
        }
        System.out.println("El valor total es:" + precioTotal);
    }

    public void hallarMayorValor () {
            Scanner lectorDatos = new Scanner(System.in);
            System.out.println(" Ingrese número A");
            int numeroA = lectorDatos.nextInt();
            System.out.println(" Ingrese número B");
            int numeroB = lectorDatos.nextInt();
            System.out.println(" Ingrese número C");
            int numeroC = lectorDatos.nextInt();
            int numeroM;

            if (numeroA > numeroB) {
                numeroM = numeroA;
                if (numeroC > numeroB) ;
            } else {
                numeroM = numeroB;

                System.out.println("El número mayor es:" + numeroM);
            }
        }

    public void incrementarNumero() {
        int numero = 5;
        System.out.println("El valor del número es:" + numero);
        System.out.println("El valor del número con pre-incremento es:" + ++numero);
        System.out.println("El valor del numero con post incremento es:" + numero++);
        System.out.println("El valor del número es:" + numero);
    }

    public void decrementarNumero () {
        int numero = 5;
        System.out.println("El valor del número es:" + numero);
        System.out.println("El valor del número con pre-decremento es:" + --numero);
        System.out.println("El valor del numero con post decremento es:" + numero--);
        System.out.println("El valor del número es:" + numero);
    }

    public void negarCondicion() {
        boolean condicion = true; {
        // con el operador lógico de exclamación evalúa no un verdadero sino una condición falsa
        if (!condicion == true);
            System.out.println("Se cumple condición");
        }
    }

    public void compararValor(){
        int numero1= 5;
        int numero2= 6;
        // el operador relacional == compara esos dos números son iguales y arroja un valor booleano
        System.out.println("Los valores son iguales: " + (numero1 == numero2));
        // el operador (!)compara si dos valores son diferentes y arroja un valor booleano
        System.out.println("Los valores son diferentes: " + (numero1 != numero2));

        }
}




