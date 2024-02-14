package J04017;

import java.util.Scanner;

public class Matrix {

    private int row, col;
    private int[][] matrix;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        matrix = new int[row][col];
    }
    
    public void nextMatrix(Scanner sc){
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
    }
    
    public Matrix trans(){
        Matrix res = new Matrix(col, row);
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                res.matrix[j][i] = matrix[i][j];
            }
        }
        return res;
    }
    
    public String mul(Matrix b){
        int tmp;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < b.col ; j++){
                tmp = 0;
                for(int k = 0 ; k < col ; k++){
                    tmp += matrix[i][k] * b.matrix[k][j];
                }
                System.out.print(tmp + " ");
            }
            System.out.println();
        }
        return "";
    }  
    
}
