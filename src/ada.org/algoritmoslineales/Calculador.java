package algoritmoslineales;

import java.util.Scanner;

public class Calculador {
    public void sumarNumeros() {
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("Ingrese sumando A");
        int sumandoA = lectorDatos.nextInt();
        System.out.println("Ingrese sumando B");
        int sumandoB = lectorDatos.nextInt();

        int resultadoSuma = sumandoA + sumandoB;
        System.out.println(" El resultado de la suma es:" + resultadoSuma);
    }

    public void calcularPromedio(){
        final byte CANTIDAD_NOTAS =4;

        Scanner lectorDatos = new Scanner(System.in);

        System.out.println("Ingrese la primera nota");
        double n1= lectorDatos.nextDouble();
        System.out.println("Ingrese la segunda nota");
        double n2= lectorDatos.nextDouble();
        System.out.println("Ingrese la tercera nota");
        double n3= lectorDatos.nextDouble();
        System.out.println("Ingrese la cuarta nota");
        double n4= lectorDatos.nextDouble();

        double promedioNotas = n1 + n2 + n3 + n4 / CANTIDAD_NOTAS;
        System.out.println(" El promedio de notas es:" + promedioNotas);
    }

}

