// 1.Minimum Right Shifts to Sort the Array
class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        int pivot = -1;

        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                if (pivot != -1)
                    return -1;
                pivot = i;
            }
        }

        if (pivot == -1)
            return 0;

        if (nums.get(n - 1) > nums.get(0))
            return -1;

        return n - pivot - 1;
    }
}
