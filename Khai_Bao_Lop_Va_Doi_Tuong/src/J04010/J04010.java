package J04010;

import java.util.Scanner;

public class J04010 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            
            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p1.distance(p3);
            
            if(a+b > c && a+c > b && b+c > a){
                double area = 0.25 * Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c));
                double r = (a*b*c) / (4.0*area);
                double res = Math.PI * r * r;
                System.out.println(String.format("%.3f", res));
            } else {
                System.out.println("INVALID");
            }
        }
        
        sc.close();
        
    }

}
