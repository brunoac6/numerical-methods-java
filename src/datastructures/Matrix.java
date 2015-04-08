package datastructures;

import java.util.ArrayList;

public class Matrix {
    private ArrayList<ArrayList<Double>> matrix;
    private int rows;
    private int cols;
    
    public Matrix() {
        
    }
    
    public Matrix(double m[][], int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix.get(i).set(j, m[i][j]);
            }
        }
    }
    
    public Matrix(double value, int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix.get(i).set(j, value);
            }
        }
    }
    
    public double get(int i, int j) {
        return matrix.get(i).get(j);
    }
    
    private double set(int i, int j, double value) {
        return 1;
    }
    
    public Matrix add(Matrix m) {
        if(this.cols != m.cols || this.rows != m.rows) 
            return null;
        else {
            Matrix tmp = new Matrix(0,m.rows,m.cols);
            for(int i=0; i<this.rows; i++)
                for(int j=0; j<this.cols; j++)
                    tmp.set(i, j, this.get(i, j) + m.get(i, j));
            return tmp;
        }
    }
    
    public Matrix sub(Matrix m) {
        return null;
    }
    
    public Matrix mul(Matrix m) {
        return null;
    }
    
    public Matrix tran(Matrix m) {
        return null;
    }
    
    public String toString() {
        return String.format("oi");
    }
}
