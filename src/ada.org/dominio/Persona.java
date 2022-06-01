package ada.org.dominio;

public class Persona {

    private String nombre;
    private String apellido;
    private byte edad;
    private double estatura;
    private char genero;
    private  String fechaNacimiento;
    private String colorCabello;
    private String nacionalidad;

    public Persona(String nombre, String apellido, byte edad, double estatura, char genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
        this.genero = genero;

    }

    public void decirNombreCompleto(){
        System.out.println("Mi nombre es " + nombre + " " + apellido);

    }
}
