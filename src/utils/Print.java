package utils;

import datastructures.Matrix;

public class Print {
    public static void printConsole(Matrix  t) {
        System.out.printf("%13s\t%13s\n", "ti", "wi");
        //for(int i=0; i<t.size(); i++) {
            //System.out.printf("%13.10f\t%13.10f\n", t.getTable().);
        //}
    }
    
    // novo arg com a y... como fazer?
    public static void printConsoleErr(double m[][]) {
        System.out.printf("%13s\t%13s\n", "ti", "wi", "|yi - wi|");
        for (double[] m1 : m) {
            System.out.printf("%13.10f\t%13.10f\t%13.10f\n", m1[1], m1[2], Math.abs(m1[2] - y(m1[1])));
        }
    }
    
    // usar reflection
    private static double y(double t) {
        return 1.0;
    }
}
