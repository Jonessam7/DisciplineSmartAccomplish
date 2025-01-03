package d03m01y25;

import java.util.Arrays;
// import java.util.rayays;

public class TwoSum {
  public static int[] TS(int[] arr, int target){
    int n = arr.length;
 int[] ans ={-1,-1};
    int[][] ray = new int[n][2];
    for (int i = 0; i < arr.length; i++) {
       ray[i][0]= arr[i];
       ray[i][1]=i;
    }

    Arrays.sort(ray ,(a,b) -> Integer.compare(a[0], b[0]));

    int left = 0, right = n - 1;

    while (left < right){
        int sum = ray[left][0] + ray[right][0];

        if (sum == target) {
            ans[0] = ray[left][1];
            ans[1] = ray[right][1];
            return ans;
            
        } else if (sum < target) {
            
            left++;
            
        } else {
            right--;
            
        }
      }

      return ans;
  }
    public static void main(String[] args) {
    int[] nums ={1,4,2,5,3};
    int[] ans = TS(nums, 9);
    System.out.println(Arrays.toString(ans));
  }
}
