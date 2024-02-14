package J04010;

public class Point {

    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point p){
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }
    
}
