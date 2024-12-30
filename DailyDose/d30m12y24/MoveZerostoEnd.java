package d30m12y24;

import java.util.Arrays;

public class MoveZerostoEnd {
    public  void MZTE(int[] arr) {
        int j = 0; //  how may Non-zeroz where there
        

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
               
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++; // it Moves pointer when you find the Non-Zero
            }
        }
        System.out.println(j);
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 0, 5, 2};
        System.out.println(Arrays.toString(nums));
        MoveZerostoEnd mzte = new MoveZerostoEnd();
        mzte.MZTE(nums);
        System.out.println(Arrays.toString(nums));
    }
}
