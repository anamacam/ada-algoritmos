package ada.org.dominio;

public class Vehicle {

    private String brand;
    private String maxSpeed;
    private String color;

    public Vehicle(String brand, String maxSpeed, String color) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.color = color;

    }

    public void move() {
        System.out.println("El vehiculo esta en movimiento");
    }

    public void setMaxSpeed() {
        System.out.println("la Ferrari alcanza una velocidad maxima de 350 km/h.");
    }
}
