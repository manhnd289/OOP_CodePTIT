package J07058;

public class MonHoc implements Comparable<MonHoc>{

    private String IDsub, nameSub, formExam;

    public MonHoc(String IDsub, String nameSub, String formExam) {
        this.IDsub = IDsub;
        this.nameSub = nameSub;
        this.formExam = formExam;
    }

    @Override
    public String toString() {
        return IDsub + " " + nameSub + " " + formExam;
    }

    @Override
    public int compareTo(MonHoc o) {
        return IDsub.compareTo(o.IDsub);
    }
    
}
