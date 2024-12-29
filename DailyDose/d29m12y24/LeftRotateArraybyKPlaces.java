package d29m12y24;

import java.util.Arrays;

public class LeftRotateArraybyKPlaces {
 public  void rotateArray(int[] arr,int k){

  if(k > arr.length) k %= arr.length;

  reverse(arr, 0, k-1);
  reverse(arr,k, arr.length-1);
 reverse(arr, 0, arr.length -1);
 }
 private void reverse(int[] nums, int start, int end){
  while (start < end) {
    int temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
    start++;
    end--;
  }
 }
 public static void main(String[] args) {
  int[] nums = {1,2,3,4,5,6};
  int k = 1;
  LeftRotateArraybyKPlaces lraKp = new LeftRotateArraybyKPlaces();
  lraKp.rotateArray(nums, k);
System.out.println(Arrays.toString(nums));
 }
}