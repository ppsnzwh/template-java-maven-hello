package org.designpattern.factorypattern;

public class Square implements Shape {
 
    @Override
    public void draw() {
       System.out.println("Inside Square::draw() method.");
    }

    @Override
   public void color() {
      System.out.println("Square : red");

   }
 }
