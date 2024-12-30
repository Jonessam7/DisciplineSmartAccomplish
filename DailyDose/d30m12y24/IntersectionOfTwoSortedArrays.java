package d30m12y24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
  public static int[] IOTSA(int[] num1, int[] num2){
    int i=0,j=0;
    List<Integer> insert = new ArrayList<>();
    while (i< num1.length && j<num2.length) {
      if(num1[i] == num2[j]){
              insert.add(num1[i]);
              i++;
              j++;
      }else if(num1[i] > num2[j]){
            j++;
      }else{
        i++;
      }
      
    }
    int[] result = insert.stream().mapToInt(Integer::intValue).toArray();

    return result;

  }
  public static void main(String[] args) {

    int[] num1={1, 2, 2, 3, 5};
    int[] num2={1, 2,7};
    int[] ans = IOTSA(num1, num2);
    System.out.println(Arrays.toString(ans));


  }
}
