package d31m12y24;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collection;
import java.util.Collections;

public class LeaderInAnArray {
  public static int[] LIAA(int[] arr){
    ArrayList<Integer> aL = new ArrayList<>();
    int min_val = Integer.MIN_VALUE;
    for(int i = arr.length-1; i > 0; i--){
      if(arr[i] > min_val){
        aL.add(arr[i]);
        min_val = arr[i];
      }
    }
    Collections.reverse(aL);

    int[] ans = aL.stream().mapToInt(Integer::intValue).toArray();

    return ans;
  }
  public static void main(String[] args) {
    int[] num = {1, 2, 5, 3, 1, 2};
    int[] ans = LIAA(num);
    System.out.println(Arrays.toString(ans));
  }
}
