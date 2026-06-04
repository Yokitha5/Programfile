// 1. Maximum Number of Pairs in Array
class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] freq = new int[101];
        
        for (int num : nums) {
            freq[num]++;
        }
        
        int pairs = 0;
        int left = 0;
        
        for (int count : freq) {
            pairs += count / 2;
            left += count % 2;
        }
        
        return new int[]{pairs, left};
    }
}
