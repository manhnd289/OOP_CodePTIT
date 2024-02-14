package J04019;

public class Triangle {

    private Point p1,p2,p3;
    private double a,b,c;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        a = p1.distance(p2);
        b = p2.distance(p3);
        c = p1.distance(p3);
    }
    
    public boolean valid(){
        if(a + b > c && a + c > b && b+c > a) return true;
        return false;
    }
    
    public String getPerimeter(){
        double res = a+b+c;
        return String.format("%.3f", res);
    }
    
}
