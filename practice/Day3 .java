// 1. Search Insert Position
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else if(target<nums[i]){
                return i;
            }
        }
        return nums.length;
        
    }
}
// 2.Pascal's Triangle
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> listin = new ArrayList<>();
        for(int j=0;j<=i;j++){
            if(j==0||j==i){
                listin.add(1);
            }
            else{
                listin.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }
        }
            list.add(listin);
        }
        return list;
        
    }
}

// 3. Spiral Matrix
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                res.add(matrix[top][i]);
            top++;

            for (int i = top; i <= bottom; i++)
                res.add(matrix[i][right]);
            right--;

          
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    res.add(matrix[bottom][i]);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    res.add(matrix[i][left]);
                left++;
            }
        }

        return res;
    }
}
