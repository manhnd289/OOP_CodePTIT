package J04019;

import java.util.Scanner;

public class Point {

    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextDouble(), sc.nextDouble());
    }
    
    public double distance(Point o){
        return Math.sqrt(Math.pow(x-o.x, 2) + Math.pow(y-o.y, 2));
    }
    
}
