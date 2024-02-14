package J04018;

public class Complex {

    private int real_Num, imaginary_Num;
    private String signal;

    public Complex(int real_Num, int imaginary_Num) {
        this.real_Num = real_Num;
        this.imaginary_Num = imaginary_Num;
    }
    
    public static Complex mul(Complex a, Complex b){
        return new Complex(a.real_Num*b.real_Num - a.imaginary_Num*b.imaginary_Num, a.real_Num*b.imaginary_Num+a.imaginary_Num*b.real_Num);
    }
    
    public static Complex add(Complex a, Complex b){
        return new Complex(a.real_Num + b.real_Num, a.imaginary_Num + b.imaginary_Num);
    }

    @Override
    public String toString() {
        if(imaginary_Num > 0) signal = " + ";
        else if(imaginary_Num < 0) signal = " - ";
        else return real_Num + "";
        
        return real_Num + signal + Math.abs(imaginary_Num) + "i";
    }
    
    
}
