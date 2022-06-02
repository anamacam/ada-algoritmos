package ada.org.algoritmoslineales;

import java.util.Scanner;

public class EstructuraDeRepeticion {
    public void sumarVector() {
        int[] vectorNumeros = new int[10];
        int sumatoria = 0;
        Scanner lectorDatos = new Scanner(System.in);
        for (int i = 0; i < vectorNumeros.length; i++) {
            System.out.println("Ingrese valor para la posición:" + i);
            vectorNumeros[i] = lectorDatos.nextInt();
        }
        for (int i = 0; i < vectorNumeros.length; i++) {
            sumatoria = sumatoria + vectorNumeros[i];
            System.out.println("La sumatoria de los valores es:" + sumatoria);
        }
    }

    public void calcularStock() {
        final int CANTIDAD_PRODUCTOS = 3;
        int[] Stock = new int[CANTIDAD_PRODUCTOS];
        int[] Pedidos = new int[CANTIDAD_PRODUCTOS];
        int[] Faltantes = new int[CANTIDAD_PRODUCTOS];
        Scanner lectorDatos = new Scanner(System.in);

        for (int i = 0; i < CANTIDAD_PRODUCTOS; i++) {
            System.out.println(" Ingrese la cantidad stock producto:" + i);
            Stock[i] = lectorDatos.nextInt();
            System.out.println(" Ingrese la cantidad pedido producto:" + i);
            Pedidos[i] = lectorDatos.nextInt();
        }

        for (int i = 0; i < CANTIDAD_PRODUCTOS; i++) {
            if (Stock[i] == Pedidos[i]) {
                Faltantes[i] = Stock[i];
            } else if (Pedidos[i] > Stock[i]) {
                Faltantes[i] = (Pedidos[i] - Stock[i]) * 2;
            } else {
                Faltantes[i] = Pedidos[i];
            }
        }

        for (int i = 0; i < CANTIDAD_PRODUCTOS; i++) {
            System.out.println("Los faltantes del producto:" + i + " son " + Faltantes[i]);
        }
    }

    public void sumarMatrices() {
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("Ingrese el número de filas");
        byte filas = lectorDatos.nextByte();
        System.out.println("Ingrese el número de columnas");
        byte columnas = lectorDatos.nextByte();
        int[][] numerosA = new int[filas][columnas];
        int[][] numerosB = new int[filas][columnas];
        int[][] resultados = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese número para la matriz A en la posición: " + i + "" + j);
                numerosA[i][j] = lectorDatos.nextInt();
                System.out.println("Ingrese n{umero para la matriz B en la posición:" + i + "" + j);
                numerosB[i][j] = lectorDatos.nextInt();

            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultados[i][j] = numerosA[i][j] + numerosB[i][j];
                System.out.println(" La sumatoria en pos" + i + j + "es:" + resultados[i][j]);
            }
        }
    }

    public void transponerMatriz() {
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("Ingrese el número de filas");
        byte filas = lectorDatos.nextByte();
        System.out.println("ingrese el numero de columnas");
        byte columnas = lectorDatos.nextByte();
        int[][] matrizOriginal = new int[filas][columnas];
        int[][] matrizTranspuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; i < columnas; j++) {
                System.out.println("Ingrese numero para la matriz en la posición:" + i + "" + j);
                matrizOriginal[i][j] = lectorDatos.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; i < columnas; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
                System.out.println("El valor de la matriz en la transpuesta en la pos :" + i + "" + j + " es " + matrizTranspuesta[i][j]);

            }
        }


    }

    public void contarCeros() {
        Scanner letorDatos = new Scanner(System.in);
        int[][] numeros = new int[4][4];
        byte contadorCeros = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Ingrese número en la posición" + i + j);
                numeros[i][j] = letorDatos.nextInt();
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] == 0) {
                    contadorCeros++;
                }
            }
        }
        System.out.println("La cantidad de ceros encontrada fue:" + contadorCeros);
    }

    public void totalizarRecorrido() {
        Scanner letorDatos = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de conductores:");
        byte cantidadConductores = letorDatos.nextByte();
        String[] diaSemana = new String[6];
        diaSemana[0] = "Lunes:";
        diaSemana[1] = "Martes:";
        diaSemana[2] = "Miércoles:";
        diaSemana[3] = "Jueves:";
        diaSemana[4] = "Viernes:";
        diaSemana[5] = "Sábado:";
        String[] conductores = new String[cantidadConductores];
        int[][] kmRecorridos = new int[cantidadConductores][6];
        int[] totalKm = new int[cantidadConductores];
        for (int i = 0; i < conductores.length; i++) {
            System.out.println("Ingrese los nombres de los conductores:");
            conductores[i] = letorDatos.next();

            for (int j = 0; j < kmRecorridos[i].length; j++) {
                System.out.println("Ingrese total km para" + conductores[i] + " en el día " + diaSemana[j]);
                kmRecorridos[i][j] = letorDatos.nextInt();
            }
        }
        for (int i = 0; i < conductores.length; i++) {
            for (int j = 0; j < kmRecorridos[i].length; j++) {
                totalKm[i] = totalKm[i] + kmRecorridos[i][j];
            }
        }
        for (int i = 0; i < conductores.length; i++) {
            System.out.println("El conductor " + conductores[i] + " recorrió: " + totalKm[i] + " km");
        }
    }
}



