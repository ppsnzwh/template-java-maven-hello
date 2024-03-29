package org.designpattern.factorypattern;


public class Rectangle implements Shape {
 
    @Override
    public void draw() {
       System.out.println("Inside Rectangle::draw() method.");
    }

    @Override
   public void color() {
      System.out.println("Rectangle : blue");
   }
 }
