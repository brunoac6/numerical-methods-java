package datastructures;

import java.util.ArrayList;

public class Matrix {
    private ArrayList<ArrayList<Double>> matrix;

    public Matrix() {
        
    }
        
    public Matrix(double m[][], int rows, int cols) {
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix.get(i).set(j, m[i][j]);
            }
        }
    }
    
    public Matrix add(Matrix m) {
        return null;
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
}
