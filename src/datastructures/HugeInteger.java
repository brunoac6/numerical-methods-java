package datastructures;

import java.util.Arrays;

public class HugeInteger {
    private int number[];
    private int tam;
    private int base;
    
    public HugeInteger(String n, int base) {
        this.tam = n.length();
        this.number = new int[tam];
        for(int i=0; i<tam; i++) 
            number[i] = Integer.parseInt(n.substring(i, i+1));
        this.base = base;
    }
    
    public HugeInteger add(HugeInteger i) {
        return null;
    }
    
    public HugeInteger sub(HugeInteger i) {
        return null;
    }
    
    public HugeInteger mul(HugeInteger i) {
        return null;
    }
    
    public HugeInteger div(HugeInteger i) {
        return null;
    }
    
    public HugeInteger mod(HugeInteger i) {
        return null;
    }
    
    @Override
    public String toString() {
        String tmp = "";
        for(int i=0; i<tam; i++)
            tmp += number[i];
        return tmp;
    }
}