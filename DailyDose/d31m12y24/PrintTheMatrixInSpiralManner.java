package d31m12y24;

import java.util.*;

public class PrintTheMatrixInSpiralManner {
  public static List<Integer> PTMISM(int[][] arr) {
    List<Integer> Al = new ArrayList<>();

    int m = arr.length;
    int n = arr[0].length;

    int left = 0, right = n - 1;

    int top = 0, botm = m - 1;

    while (top <= botm && left <= right) {

      for (int i = left; i <= right; i++) {
        Al.add(arr[top][i]);
      }
      top++;

      for (int i = top; i <= botm; i++) {
        Al.add(arr[i][right]);
      }
      right--;

      if (top <= botm) {
        for (int i = right; i >= left; i--) {
          Al.add(arr[botm][i]);
        }
        botm--;
      }

      if (left <= right) {
        for (int i = botm; i >= top; i--) {
          Al.add(arr[i][left]);
        }
        left++;
      }
    }

    return Al;
  }

  public static void main(String[] args) {
    int[][] arr = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
       
    };
    List<Integer> aL = PTMISM(arr);
    System.out.println(aL);
  }
}
