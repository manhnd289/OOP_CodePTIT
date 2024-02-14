package J04008;

public class Triangle {

    double x1,y1,x2,y2,x3,y3;
    double a1,a2,a3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        a1 = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
        a2 = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2));
        a3 = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
    }

    @Override
    public String toString() {
        return (a1+a2 > a3 && a1+a3 > a2 && a2+a3>a1) ? String.format("%.3f", a1+a2+a3) : "INVALID";
    }
    
    
    
    
    
}
