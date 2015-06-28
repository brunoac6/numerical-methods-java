package datastructures;

import java.util.ArrayList;

public class Matrix {
    private double[][] matrix;
    private int rows;
    private int cols;
    
    public Matrix() {
        
    }
    
    public Matrix(double m[][], int rows, int cols) {
        matrix = new double[rows][cols];
        this.rows = rows;
        this.cols = cols;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                this.matrix[i][j] = m[i][j];
            }
        }
    }
    
    public Matrix(double value, int rows, int cols) {
        matrix = new double[rows][cols];
        this.rows = rows;
        this.cols = cols;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j] = value;
            }
        }
    }
    
    public double get(int i, int j) {
        return matrix[i][j];
    }
    
    private void set(int i, int j, double value) {
        matrix[i][j] = value;
    }
    
    public Matrix add(Matrix m) {
        if(this.cols != m.cols || this.rows != m.rows) 
            return null;
        else {
            Matrix tmp = new Matrix(0,m.rows,m.cols);
            for(int i=0; i<this.rows; i++)
                for(int j=0; j<this.cols; j++)
                    tmp.set(i, j, m.get(i, j) + this.matrix[i][j]);
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
