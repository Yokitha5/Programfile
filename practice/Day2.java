import java.util.*;

class Day2 {

    // 1. Longest Substring Without Repeating Characters
    public static int longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    // 2. Kadane’s Algorithm
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0], curr = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            maxSum = Math.max(maxSum, curr);
        }
        return maxSum;
    }

    // 3. Move Zeros to End
    public static void moveZeros(int[] nums) {
        int j = 0;
        for (int num : nums) {
            if (num != 0) nums[j++] = num;
        }
        while (j < nums.length) nums[j++] = 0;
    }

    // 4. Container With Most Water
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            max = Math.max(max, h * (right - left));

            if (height[left] < height[right]) left++;
            else right--;
        }
        return max;
    }

    // 5. Find Duplicate Number (Floyd Cycle)
    public static int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    // 6. Majority Element (Boyer-Moore)
    public static int majorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    // 7. Sort Colors (Dutch National Flag)
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low++] = nums[mid];
                nums[mid++] = temp;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high--] = temp;
            }
        }
    }

    // 8. Next Greater Element
    public static int[] nextGreater(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return res;
    }

    // 9. Subarray Sum Equals K
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    // 10. Best Time to Buy and Sell Stock
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, profit = 0;

        for (int price : prices) {
            if (price < min) min = price;
            else profit = Math.max(profit, price - min);
        }
        return profit;
    }

    public static void main(String[] args) {

        System.out.println(longestSubstring("abcabcbb"));

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));

        int[] zeros = {0,1,0,3,12};
        moveZeros(zeros);
        System.out.println(Arrays.toString(zeros));

        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

        int[] dup = {1,3,4,2,2};
        System.out.println(findDuplicate(dup));

        int[] maj = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(maj));

        int[] colors = {2,0,2,1,1,0};
        sortColors(colors);
        System.out.println(Arrays.toString(colors));

        int[] nge = {4,5,2,10};
        System.out.println(Arrays.toString(nextGreater(nge)));

        int[] sub = {1,1,1};
        System.out.println(subarraySum(sub, 2));

        int[] price = {7,1,5,3,6,4};
        System.out.println(maxProfit(price));
    }
}
