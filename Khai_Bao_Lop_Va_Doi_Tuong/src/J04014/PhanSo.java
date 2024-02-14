package J04014;

public class PhanSo {

    private long tuSo, mauSo;
    
    private static long gcd(long a, long b){
        while(a*b != 0){
            if(a > b) a%=b;
            else b%=a;
        }
        return a+b;
    }

    public PhanSo(long tuSo, long mauSo) {
        long tmp = gcd(mauSo, tuSo);
        this.tuSo = tuSo / tmp;
        this.mauSo = mauSo / tmp;
    }
    
    public static PhanSo add(PhanSo a, PhanSo b){
        return new PhanSo(a.tuSo * b.mauSo + a.mauSo * b.tuSo, a.mauSo * b.mauSo);
    }
    
    public static PhanSo mul(PhanSo a, PhanSo b){
        return new PhanSo(a.tuSo * b.tuSo, a.mauSo * b.mauSo);
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
    
}
