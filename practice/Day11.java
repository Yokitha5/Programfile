// 1.jump game
class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int end = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == end) {
                jumps++;
                end = farthest;
            }
        }

        return jumps;
    }
}

// 2.Egg Drop With 2 Eggs and N Floors
class Solution {
    public int twoEggDrop(int n) {
        int move=0;
        int total=0;
        while(total<n){
            move++;
            total+=move;
        }
        return move;
    }
}
