package ivpode;

import datastructures.Matrix;

public class Euler {
    
    public static Matrix method(double a, double b, int N, double alpha) {
        Matrix results = new Matrix();
        double h, w, t;
        
        h = (b-a)/N;
        t = a;
        w = alpha;
        
        //results.addPoint(t, w);
        for(int i=1; i<=N; i++) {
            w = w + h*f(t,w);
            t = a + i*h;
            //results.addPoint(t, w);
        }
        
        return results;
    }
    
    // abstrato
    private static double f(double t, double y) {
        return (1 - t*t + y);
    }
}
