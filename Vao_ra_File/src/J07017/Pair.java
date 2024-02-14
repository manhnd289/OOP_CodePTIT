package J07017;

public class Pair<T, U> {
    
    private T p1;
    private U p2;

    public Pair(T p1, U p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    private boolean prime(int n){
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0) return false;
        }
        return n>=2;
    }
    
    public boolean isPrime(){
        return prime(Integer.parseInt(p1.toString())) && prime(Integer.parseInt(p2.toString()));
    }

    @Override
    public String toString() {
        return p1 + " " + p2;
    }

}
