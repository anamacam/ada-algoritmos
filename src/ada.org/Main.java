import org.ada.algoritmoslineales.EstructuraDeRepeticion;
import org.ada.dominio.Animal;
import org.ada.dominio.Item;
import org.ada.dominio.Perro;
import org.ada.dominio.Persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        // byte edad =
        //Persona ana = new Persona("Ana","Castro",edad, 1.50,'F')
        //ana.decirNombreCompleto();
        //double peso = 45
        //double estatura = 45
        //byte vida= 6
        //Perro dogoBurdeos = new Perro("Dogo de Burdeos", "tranquilo",peso,estatura, vida,"media", "delicado");
        //dogoBurdeos.perroRaza()

        //Animal animal = new Animal("gato", "pardo","garfield" );
        //animal.sleep();
        //animal.eat();
        //animal.move()

        Date expirationDate = new SimpleDateFormat("dd-nn-yyyy, hh:mn:ss").parse("17-05-2022 18:00:00");
        Item orangeJuice = new Item("Orange Juice", 120, expirationDate);
        if (orangeJuice.canItBeSold()){
            orangeJuice.calculateTax();
            System.out.println(" el valor a pagar es:" + orangeJuice.getTotalToPay());

        }else  System.out.println("El item no esta habilitado para la venta");
    }
}

