// 1. Reverse Bits
public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        
        for (int i = 0; i < 32; i++) {
            result <<= 1;        
            result |= (n & 1); 
            n >>= 1;          
        }
        
        return result;
    }
}

// 2. Sliding Window Maximum
import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        
        Deque<Integer> a = new ArrayDeque<>();
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (!a.isEmpty() && a.peekFirst() == i - k) {
                a.pollFirst();
            }

            while (!a.isEmpty() && nums[a.peekLast()] < nums[i]) {
                a.pollLast();
            }

            a.offerLast(i);

            if (i >= k - 1) {
                res[idx++] = nums[a.peekFirst()];
            }
        }

        return res;
    }
}
