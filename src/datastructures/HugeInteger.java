package datastructures;

public class HugeInteger {
    private int number[];
    private int tam;
    
    public HugeInteger(String n) {
        this.tam = n.length();
        this.number = new int[tam];
        for(int i=0; i<tam; i++) 
            number[i] = Integer.parseInt(n.substring(i, i));
    }
    
    
}