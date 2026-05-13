// 1.Majority Element
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for(int num : nums){
            if(count == 0){
                candidate = num;
            }

            if(num == candidate){
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}

// 2.House Robber
class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;
        for(int num : nums) {
            int pick = num + prev2;
            int notPick = prev1;
            int curr = Math.max(pick, notPick);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
