package J07045;

public class LoaiPhong implements Comparable<LoaiPhong>{

    private String Sign, nameType;
    private int donGia;
    private double phiPhucVu;

    public LoaiPhong(String inp) {
        String[] item = inp.trim().split("\\s+");
        this.Sign = item[0];
        this.nameType = item[1];
        this.donGia = Integer.parseInt(item[2]);
        this.phiPhucVu = Double.parseDouble(item[3]);
    }

    @Override
    public String toString() {
        return Sign + " " + nameType + " " + donGia + " " + phiPhucVu;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return nameType.compareTo(o.nameType);
    }
    
    
    
}
