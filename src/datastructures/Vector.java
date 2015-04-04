package datastructures;

public class Vector {
    private double[] v;
    private int dim;
    
    public Vector(int dim) {
        this.v = new double[dim];
        this.dim = dim;
    }
    
    public Vector(double... coordenates) {
        this.dim = coordenates.length;
        this.v = new double[this.dim];
        System.arraycopy(coordenates, 0, v, 0, dim);
    }
    
    public Vector add(Vector v) {
        if(this.dim != v.dim)
            return null;
        else {
            Vector v3 = new Vector(v.dim);
            for(int i=0; i<v.dim; i++)
                v3.v[i] = this.v[i] + v.v[i];
            return v3;
        }
    }
    
    public double dot(Vector v) {
        if(this.dim != v.dim) 
            return -1;
        else {
            double sum = 0;
            for(int i=0; i<v.dim; i++)
                sum = this.v[i]*v.v[i];
            return sum;
        }
    }
    /*
    @Override
    public String toString() {
        String tmp;
        tmp = "(";
        for(int i=0; i<dim; i++) {
            tmp += (char) v[i];
            tmp += ", ";
        }
        tmp += ")";
        return tmp;
    }
    */
}
