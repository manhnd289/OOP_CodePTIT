package J04016;

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
    
    public Matrix mul(Matrix b){
        Matrix res = new Matrix(row, b.col);
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < b.col ; j++){
                for(int k = 0 ; k < col ; k++){
                    res.matrix[i][j] += matrix[i][k] * b.matrix[k][j];
                }
            }
        }
        return res;
    }

    @Override
    public String toString() {
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        return "";
    }
    
    
    
    
}
