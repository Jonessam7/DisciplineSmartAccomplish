package d05m01y25;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceInAnArray {
  public static int LCSIA(int[] nums) {
        int n = nums.length;
        // If the array is empty
        if (n == 0) return 0;

        // Initialize the longest sequence length
        int longest = 1; 
        Set<Integer> st = new HashSet<>();

        // Put all the array elements into the set
        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }

        /* Traverse the set to 
           find the longest sequence */
        for (int it : st) {
            // Check if 'it' is a starting number of a sequence
            if (!st.contains(it - 1)) {
                // Initialize the count of the current sequence
                int cnt = 1; 
                // Starting element of the sequence
                int x = it; 

                // Find consecutive numbers in the set
                while (st.contains(x + 1)) {
                    // Move to the next element in the sequence
                    x = x + 1; 
                    // Increment the count of the sequence
                    cnt = cnt + 1; 
                }
                // Update the longest sequence length
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
      int[] nums = {100, 4, 200, 1, 3, 2};
      int ans = LCSIA(nums);
      System.out.println(ans);
    }
}
/*Longest Consecutive Sequence Definition:

The longest consecutive sequence means finding the maximum length of a sequence where numbers follow each other consecutively without any gaps.
Checking Each Element:

For each number it in the set, we check if it - 1 is in the set.
If it - 1 is not in the set, it means it is the start of a new consecutive sequence.
Iteration Explanation:


Iteration 1: it = 100:-

Condition: st.contains(100 - 1) → st.contains(99) → false
Since 99 is not in the set, 100 is identified as the start of a sequence.
However, the sequence from 100 is short (just 100 alone).
Sequence Found: 100 (length 1)




Iteration 2: it = 4:-

Condition: st.contains(4 - 1) → st.contains(3) → true
Since 3 is in the set, 4 is not the start of a new sequence.
Skip Processing for 4.




Iteration 3: it = 200:-

Condition: st.contains(200 - 1) → st.contains(199) → false
Since 199 is not in the set, 200 is identified as the start of a sequence.
However, the sequence from 200 is short (just 200 alone).
Sequence Found: 200 (length 1)



Iteration 4: it = 1:-

Condition: st.contains(1 - 1) → st.contains(0) → false
Since 0 is not in the set, 1 is identified as the start of a new sequence.
Start finding the sequence from 1.
While Loop:
st.contains(2) → true → cnt = 2
st.contains(3) → true → cnt = 3
st.contains(4) → true → cnt = 4
st.contains(5) → false → Exit the loop
Longest Sequence Found: 1, 2, 3, 4 (length 4)



Iteration 5: it = 3:-

Condition: st.contains(3 - 1) → st.contains(2) → true
Since 2 is in the set, 3 is not the start of a new sequence.
Skip Processing for 3.



Iteration 6: it = 2:-

Condition: st.contains(2 - 1) → st.contains(1) → true
Since 1 is in the set, 2 is not the start of a new sequence.
Skip Processing for 2.
 */