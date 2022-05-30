package org.ada.dominio;

public class Perro {

    private String raza;
    private String carácter;
    private double peso;
    private double estatura;
    private byte vida;
    private String actividadFísica;
    private String salud;

    public Perro(String raza, String carácter, double peso, double estatura, byte vida, String actividadFísica, String salud) {
        this.raza = raza;
        this.carácter = carácter;
        this.peso = peso;
        this.estatura = estatura;
        this.vida = vida;
        this.actividadFísica = actividadFísica;
        this.salud = salud;

    }
    public void perroRaza(){
        System.out.println("La raza de mi perro es: " + raza + " ");

    }

}
