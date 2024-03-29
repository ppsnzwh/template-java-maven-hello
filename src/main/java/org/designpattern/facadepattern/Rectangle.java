package org.designpattern.facadepattern;

public class Rectangle implements Shape {
 
    @Override
    public void draw() {
       System.out.println("Rectangle::draw()");
    }
 }