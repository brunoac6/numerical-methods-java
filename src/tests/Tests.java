package tests;

import datastructures.Complex;
import datastructures.Vector;

public class Tests {

    public static void main(String[] args) {
        
        /* Testar a Classe Complex */
        Complex z1 = new Complex(1, 2);
        Complex z2 = new Complex(1, -2);
        
        System.out.println(z1.sub(z2));
        
        /* Test Class Vector */
        Vector v1 = new Vector(1,2,3);
        Vector v2 = new Vector(4,3,2);
        
        System.out.println(v1);
        
    }
    
}
