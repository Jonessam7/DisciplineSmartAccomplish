package d02m01y25;

public class KthMissingPositiveNumberDC {
  public static int KMPN(int[]vec, int n, int k){
    int low = 0;
    int high = n-1;
    while (low<=high) {
      int mid = (low + high) /2;
      int missK = vec[mid] - (mid +1);
      if(missK < k){
        low = mid+1;
      }else{
        high= mid -1;
      }
      
    }

    return k+high+1;
  }
  public static void main(String[] args) {
    int[] vec ={2,4,7,9,11};
    int k = 5;
    int n = vec.length;
    int ans = KMPN(vec, n, k);
    System.out.println(ans);
  }
  
}
