
package J04004;

public class PhanSo {

    private long tuSo;
    private long mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public long getTuSo() {
        return tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }
    
    private long gcd(long a, long b){
        while(a*b != 0){
            if(a > b) a%=b;
            else b%=a;
        }
        return a+b;
    }
    
    public PhanSo add(PhanSo other){
        long tmp1 = (mauSo*other.mauSo) / gcd(mauSo, other.getMauSo());
        long tmp2 = tuSo*(tmp1/mauSo) + other.getTuSo()*(tmp1/other.getMauSo());
        long tmp3 = gcd(tmp1,tmp2);
        tmp1 /= tmp3; tmp2 /= tmp3;
        return new PhanSo(tmp2, tmp1);
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
    
}
