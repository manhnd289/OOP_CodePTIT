package J07076;

import java.util.ArrayList;
import java.util.Collections;

public class Matrix {

    private int n,m,col;
    private int[][] mt;
    ArrayList<Integer> arr_num = new ArrayList<>();

    public Matrix(int n, int m, int col, String data) {
        this.n = n;
        this.m = m;
        this.col = col;
        
        mt = new int[n][m];
        String[] tmp = data.trim().split("\\s+");
        int k = 0;
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                mt[i][j] = Integer.parseInt(tmp[k++]);
                if(j == col) arr_num.add(mt[i][j]);
            }
        }
        Collections.sort(arr_num);
        for(int i = 0 ; i < n ; i++){
            mt[i][col] = arr_num.get(i);
        }
        arr_num.clear();
    }

    @Override
    public String toString() {
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(mt[i][j] + " ");
            }
            System.out.println();
        }
        return "";
    }
}
