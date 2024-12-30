package d30m12y24;

public class FindMissingNumber {
  public static int FMN(int[] nums){
    int al = nums.length;
    int expectedAns= al * (al+1) / 2;
    int actualAns = 0;

    //geting actual total sum of the arrayc( by value of array)
    for (int num : nums) {
      actualAns+=num;
    }
    return expectedAns -actualAns;
  }
  public static void main(String[] args) {
    int[] arr ={0, 1, 2, 4, 5, 6};
    int ans = FMN(arr);
    System.out.println(ans);
  }
}
