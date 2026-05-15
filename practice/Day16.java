// 1.Trionic Array I
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length - 1;

        boolean inc1 = false;
        boolean dec = false;
        boolean inc2 = false;

        int i = 0;
        while (i < n && nums[i] < nums[i + 1]) {
            inc1 = true;
            i++;
        }
        while (i < n && nums[i] > nums[i + 1]) {
            dec = true;
            i++;
        }
        while (i < n && nums[i] < nums[i + 1]) {
            inc2 = true;
            i++;
        }
        if (inc1 && dec && inc2 && i == n) {
            return true;
        }

        return false;
    }
}
