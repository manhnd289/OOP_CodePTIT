package J04020;

public class Pair <T,V> {

    private T a;
    private V b;

    public Pair(T a, V b) {
        this.a = a;
        this.b = b;
    }
    
    private boolean prime(int n){
        if(n < 2) return false;
        for(int i = 2 ; i <= Math.sqrt(n ) ; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public boolean isPrime(){
        return prime(Integer.parseInt(a.toString())) && prime(Integer.parseInt(b.toString()));
    }

    @Override
    public String toString() {
        return a + " " + b;
    }
    
    
}
