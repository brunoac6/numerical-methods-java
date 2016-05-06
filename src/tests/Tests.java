package tests;

import datastructures.Complex;
import datastructures.Vector;
import datastructures.HugeInteger;
import datastructures.Matrix;
import datastructures.Table;

public class Tests {

    public static void main(String[] args) {
            
        /* Testar a Classe Complex */
        Complex z1 = new Complex(1, 2);
        Complex z2 = new Complex(1, -2);
        
        System.out.println(z1.sub(z2));
        
        /* Test Class Vector */
        Vector v1 = new Vector(1,2,3);
        Vector v2 = new Vector(4,3,2);
        
        System.out.println(v1.add(v2));
        System.out.println(v1);
        
        /* Test Class HugeInteger */
        HugeInteger i1 = new HugeInteger("12392972309239822983293",10);
        System.out.println(i1);
        
        /* Test Class Matrix */
        double m[][] = new double[2][2];
        m[0][0] = 1; 
        m[0][1] = 5;
        m[1][0] = 9;
        m[1][1] = 4.4;
        Matrix m1 = new Matrix(m,2,2);
        System.out.println(m1.get(1, 0));
        
        Table t = new Table("Testando Table", m1);
        t.setColNames("t_i", "w_i");
        t.printTable();
    }
    
}
