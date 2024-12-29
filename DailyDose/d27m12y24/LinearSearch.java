package d27m12y24;

import java.util.Scanner;

public class LinearSearch {
  
  public static int search(int[] nums, int trg){
    for (int i = 1; i < nums.length; i++) {
      if(nums[i]== trg) return i;
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] nums ={1,2,3,4,5,6};
    int trg = in.nextInt();
    int ans = search(nums, trg);
    System.out.println(ans);
  }
}
