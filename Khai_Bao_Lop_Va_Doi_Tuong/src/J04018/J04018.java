package J04018;

import java.util.Scanner;

public class J04018 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            
            Complex a = new Complex(sc.nextInt(), sc.nextInt());
            Complex b = new Complex(sc.nextInt(), sc.nextInt());
            
            Complex tmp = Complex.add(a, b);
            
            System.out.print(Complex.mul(tmp, a) + ", ");
            System.out.println(Complex.mul(tmp, tmp));
            
        }
        
    }
    
}
