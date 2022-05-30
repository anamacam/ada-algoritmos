package org.ada.dominio;

public class Animal {
    private String breed;
    private String color;
    private String name;

    public Animal(String breed, String color, String name) {
        this.breed = breed;
        this.color = color;
        this.name = name;

    }

    public void move() {
        System.out.println("Esta en movimiento");

    }

    public void sleep() {
        System.out.println("Esta durmiendo");
    }

    public void eat() {
        System.out.println("esta comiendo");
    }
}
