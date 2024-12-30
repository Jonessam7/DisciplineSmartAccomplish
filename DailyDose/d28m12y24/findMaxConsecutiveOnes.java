package d28m12y24;

public class findMaxConsecutiveOnes {

  public static int FMCO(int[] arr){
    int ones =0;
    int count=0;
     for (int i = 0; i < arr.length; i++) {
      if(arr[i] == 1){
        ones++;
        count=Math.max(count, ones);
      }else{
        ones=0;
      }
     }
     return count;
  }
  public static void main(String[] args) {
    int[] nums={1, 0, 1, 0, 1, 0, 0, 1};
    int ans = FMCO(nums);
    System.out.println("ANS:"+ans);
  }
}
