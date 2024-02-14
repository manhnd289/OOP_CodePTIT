package J04021;

import java.util.ArrayList;
import java.util.Collections;

public class IntSet {

    private int[] arr;
    private int len;

    public IntSet(int[] arr) {
        this.arr = arr;
    }
    
    public IntSet union(IntSet a){
        ArrayList<Integer> tmp = new ArrayList<>();
        int[] check = new int[1005];
        for(Integer item : arr){
            if(check[item] == 0){
                tmp.add(item);
                check[item] = 1;
            }
        }
        for(Integer item : a.arr){
            if(check[item] == 0){
                tmp.add(item);
                check[item] = 1;
            }
        }
        Collections.sort(tmp);
        int[] tmp1 = new int[tmp.size()];
        for(int i = 0 ; i < tmp.size() ; i++){
            tmp1[i] = tmp.get(i);
        }
        IntSet res = new IntSet(tmp1);
        return res;
    }

    @Override
    public String toString() {
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        return "";
    }
}
