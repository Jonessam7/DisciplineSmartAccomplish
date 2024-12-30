package d30m12y24;

public class RemoveDuplicatesFromSortedArray {
  public static int RDFSA(int[] nums){
    int j =0;
     for (int i = 1; i < nums.length; i++) {
      if(nums[j] != nums[i]){
        j++;
        nums[j] = nums[i];
      }
     }
     return j+1;
  }
  public static void main(String[] args) {
    int[] arr = {-30, -30, 0, 0, 10, 20, 30, 30};
    int ans = RDFSA(arr);
    System.out.println(ans
    );
  }
}
