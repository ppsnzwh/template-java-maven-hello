package org.designpattern.commandpattern;

public class Stock {
   
    private String name = "zwh11111";
    private int quantity = 200;
  
    public void buy(){
       System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
       System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
 }
