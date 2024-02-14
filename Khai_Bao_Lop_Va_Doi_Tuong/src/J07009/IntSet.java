package J07009;

import java.util.TreeSet;

public class IntSet {

    private TreeSet<Integer> tset;
    
    public IntSet(int[] arr){
        tset = new TreeSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            tset.add(arr[i]);
        }
    }
    
    public IntSet(TreeSet<Integer> tset){
        this.tset = tset;
    }
    
    public IntSet intersection(IntSet other){
        tset.retainAll(other.tset);
        return new IntSet(tset);
    }

    @Override
    public String toString() {
        for(int item : tset){
            System.out.print(item + " ");
        }
        return "";
    }
    
    
}

