package org.ada.dominio;

import java.util.Date;

public class Item {

    private final double IVA = 0.19;
    private String name;
    private Double price;
    private double tax;
    private Date expirationDate;

    public Item( String name, double price, Date expirationDate){
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }
    public void calculateTax(){
        tax = price * IVA;
    }
    public double getTotalToPay(){

        return price + tax;
    }
    public boolean canItBeSold(){
        Date currentDate = new Date();

            return currentDate.after(expirationDate);
        }

    }

