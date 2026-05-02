// 1.Fruit Into Baskets
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, max = 0;

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}

// 2.Plus One
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1 ;i>=0 ; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
        digits[i]=0;
    }
    int arr[] = new int[digits.length+1];
    arr[0]=1;
    return arr;
}
}
