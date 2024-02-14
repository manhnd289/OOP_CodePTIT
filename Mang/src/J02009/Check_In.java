package J02009;

public class Check_In implements Comparable<Check_In>{

    private long start, elapsed;

    public Check_In(long start, long elapsed) {
        this.start = start;
        this.elapsed = elapsed;
    }

    @Override
    public int compareTo(Check_In o) {
        return (int)(start - o.start);
    }

    public long getStart() {
        return start;
    }

    public long getElapsed() {
        return elapsed;
    }
    
}

