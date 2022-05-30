package org.ada.dominio;

public class Gato {

    private String raza;
    private String carácter;
    private double peso;
    private double tamaño;
    private byte vida;
    private String procedencia;
    private String pelaje;
    private String colorOjos;

    public Gato(String raza, String carácter, double peso, double tamaño, byte vida, String pelaje, String procedencia, String colorOjos) {
        this.raza = raza;
        this.carácter = carácter;
        this.peso = peso;
        this.tamaño = tamaño;
        this.vida = vida;
        this.procedencia = procedencia;
        this.pelaje = pelaje;
        this.colorOjos = colorOjos;

    }

    public void gatoRaza(){
            System.out.println("La raza de mi gato es: " + raza + " ");


    }
}
