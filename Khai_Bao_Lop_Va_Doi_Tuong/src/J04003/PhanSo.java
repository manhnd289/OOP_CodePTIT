package J04003;

public class PhanSo {

    private long TuSo;
    private long MauSo;

    public PhanSo(long TuSo, long MauSo) {
        this.TuSo = TuSo;
        this.MauSo = MauSo;
    }

    @Override
    public String toString() {
        return TuSo + "/" + MauSo;
    }
    
    
    
}
