package d28m12y24;

import java.util.Arrays;

public class secondLargestElement {
  public static int SLE(int[] nums){
    if (nums.length < 2) {
      return -1;
    }
Arrays.sort(nums);
int largest = nums[nums.length - 1];
    for (int i = nums.length-2; i >= 0 ; i--) {
      if(nums[i] != largest) return nums[i];
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] nums={1,2,3,4,5};
    int ans = SLE(nums);
    System.out.println("ASWER:"+ ans);
  }
}