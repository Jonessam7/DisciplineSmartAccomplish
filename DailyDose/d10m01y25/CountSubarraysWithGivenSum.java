package d10m01y25;

import java.util.HashMap;

public class CountSubarraysWithGivenSum {
  public static int CSWGS(int[] nums, int k) {
    HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
    int currentSum = 0;
    int subArr = 0;
    prefixSumMap.put(0, 1);
    for (int i = 0; i < nums.length; i++) {
      currentSum += nums[i];

      int sumToRemove = currentSum - k;

      subArr += prefixSumMap.getOrDefault(sumToRemove, 0);

      prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);

    }

    return subArr;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 };
    int ans = CSWGS(nums, 3);
    System.out.println(ans);
  }

}
