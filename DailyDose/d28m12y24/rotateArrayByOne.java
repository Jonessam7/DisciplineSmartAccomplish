package d28m12y24;

import java.util.Arrays;

public class rotateArrayByOne {
  public static void RABO(int[] nums){
    int firstIndex = nums[0];
    for (int i = 0; i < nums.length-1; i++) {
      nums[i] =nums[i+1];
    }
    nums[nums.length - 1] = firstIndex;
    System.out.println(Arrays.toString(nums));
  }
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5};
   RABO(nums);
  }
}
