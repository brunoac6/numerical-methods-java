package datastructures;

public class Complex {
    private double Re;
    private double Im;

    public Complex(double Re, double Im) {
        this.Re = Re;
        this.Im = Im;
    }
    
    public Complex add(Complex z) {
        return new Complex(this.Re + z.Re, this.Im + z.Im);
    }
    
    public Complex sub(Complex z) {
        return new Complex(this.Re - z.Re, this.Im - z.Im);
    }
    
    public Complex mul(Complex z) {
        return new Complex(this.Re*z.Re - this.Im*z.Im, this.Re*z.Im + this.Im*z.Re);
    }
    
    public Complex conj() {
        this.Im *= -1;
        return this;
    }
    
    @Override
    public String toString() {
        if(Im > 0)
            return String.format("%.4f" + " + " + "%.4fi", Re, Im);
        else
            return String.format("%.4f" + " - " + "%.4fi", Re, Math.abs(Im));
    }
}
