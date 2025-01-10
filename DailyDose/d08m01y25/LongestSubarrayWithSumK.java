package d08m01y25;

import java.util.*;

public class LongestSubarrayWithSumK {
  public static int LSWSK(int[] nums, int k) {
    int longest = 0;
    int sum =0;
    Map<Integer,Integer> preSum = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];

      if (sum == k) {
        longest = Math.max(longest, i+1);
    }

    int rem = sum - k ;
    
    if(preSum.containsKey(rem)){
      int len = i - preSum.get(rem);
      longest = Math.max(longest, len);
    }

    if (!preSum.containsKey(sum)) {
      preSum.put(sum,i);
    }

  }
  return longest;
  }
  public static void main(String[] args) {
    int[] nums = {1,3,2,4,2,2,2,3};
    int ans = LSWSK(nums, 6);
    System.out.println(ans);

  }
}
