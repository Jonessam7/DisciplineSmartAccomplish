package d03m01y25;

import java.util.Arrays;

public class RotateMatrixBy90Degrees {

  public void RMBND(int[][] matrix){
    int n = matrix.length;

    int[][] rotated = new int[n][n];
    
    for(int i=0; i<n; i++){
        for(int j=0;j<n; j++ ){
            rotated[j][n-i-1]= matrix[i][j];
        }
    }
    for(int i=0; i<n;i++){
        System.arraycopy(rotated[i],0,matrix[i],0,n);
    }
  }
  public static void main(String[] args) {
    int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
    RotateMatrixBy90Degrees rmbnd = new RotateMatrixBy90Degrees();
    rmbnd.RMBND(arr);
    for (int[] ray : arr) {
      System.out.println(Arrays.toString(ray));
    }
   
  }
}