package d02m01y25;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
  
  public static int[] RAEBS(int[] nums) {
    int[] result = new int[nums.length];
    int pve=0,nve=1;

    for (int num : nums) {
      if (num > 0) {
        result[pve] = num;
        pve += 2;
      }else{
        result[nve]=num;
        nve += 2;
      }
     
    }
    return result;
  }
public static void main(String[] args) {
  int[]nums={1,2,3,-4,-3,-2};
  int[] ans = RAEBS(nums);
  System.out.println(Arrays.toString(ans));
 
}
}
