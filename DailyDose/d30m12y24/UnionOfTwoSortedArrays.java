package d30m12y24;

// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// import javax.print.attribute.SetOfIntegerSyntax;

public class UnionOfTwoSortedArrays {
  public static int[] UOTSA(int[] arr1, int[] arr2){
    Set<Integer> set = new HashSet<>();

    for (Integer num : arr1) {
      set.add(num);
    }

    for (Integer num : arr2) {
      set.add(num);
    }

    int[] result =set.stream().mapToInt(Integer::intValue).toArray();

    Arrays.sort(result);

    return result;
  }
  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 4, 5};
    int[] nums2 = {1, 2, 7} ;
    int[] ans = UOTSA(nums1, nums2);
    System.out.println(Arrays.toString(ans));
  }
}
