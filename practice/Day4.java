// 1. Climbing Stairs
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int prev1 = 2;
        int prev2 = 1;

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}

// 2. Squares of a Sorted Array
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];   

        int left = 0;        
        int right = n - 1;   
        int index = n - 1;  

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++; 
            } else {
                result[index] = rightSquare;
                right--; 
            }
            index--; 
        }


// 3.  Count and Say
  class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String x=countAndSay(n-1);
        String res="";
        int count=1;
        int i=0;
        while(i<x.length()){
            if(i+1<x.length() && x.charAt(i)==x.charAt(i+1)){
                count++;
            }
            else{
                res+=Integer.toString(count)+x.charAt(i);
                count=1;
            }
            i++;
        }
       return res; 
    }
}

  // 4. Jump Game
  class Solution {
    public boolean canJump(int[] nums) {
        int goal = 0;
        for(int i=0;i<=nums.length-2;i++){
            if(nums[i]<=0){
                return false;

            }
            if(nums[i]>0){
                int jump = i + nums[i];
                if(jump>goal){
                    goal=jump;

                }
            }
        }
        return true;
        
    }
}


