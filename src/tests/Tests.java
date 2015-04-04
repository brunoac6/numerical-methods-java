package tests;

import datastructures.Complex;
import datastructures.Vector;
import datastructures.HugeInteger;

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
        
        /* Test Class HugeInteger */
        HugeInteger i1 = new HugeInteger("12392972309239822983293",10);
        System.out.println(i1);
    }
    
}
