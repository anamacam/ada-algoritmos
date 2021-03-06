package ada.org;

import ada.org.dominio.Item;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        Date expirationDate = new SimpleDateFormat("dd-nn-yyyy, hh:mn:ss").parse("17-05-2022 18:00:00");
        Item orangeJuice = new Item("Orange Juice", 120, expirationDate);
        if (orangeJuice.canItBeSold()){
            orangeJuice.calculateTax();
            System.out.println(" el valor a pagar es:" + orangeJuice.getTotalToPay());

        }else  System.out.println("El item no esta habilitado para la venta");
    }
}

