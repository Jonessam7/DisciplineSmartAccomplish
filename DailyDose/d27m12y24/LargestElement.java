package d27m12y24;
public class LargestElement {
  public static int Large(int[] arr){
    int l = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] > l){
        l=arr[i];
      }
    }
    return l;
  }
  public static void main(String[] args) {
    int [] nums = {-4, -3, 0, 1, -8 };
    int ans = Large(nums);
    System.out.println(ans);
  }
}
