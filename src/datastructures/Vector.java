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
    
    @Override
    public String toString() {
        return String.format("( %d )", 0b1);
    }
}
