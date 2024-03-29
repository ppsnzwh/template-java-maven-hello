package org.designpattern.factorypattern;

public class Circle implements Shape {
 
    @Override
    public void draw() {
       System.out.println("Inside Circle::draw() method.");
    }

   @Override
   public void color() {
      System.out.println("Circle : black");
   }
 }