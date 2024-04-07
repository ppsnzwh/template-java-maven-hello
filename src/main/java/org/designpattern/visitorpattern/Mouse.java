package org.designpattern.visitorpattern;

public class Mouse  implements ComputerPart {
 
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
       computerPartVisitor.visit(this);
    }
 }