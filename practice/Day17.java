// 1.Relative Sort Array
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    list.add(arr1[j]);
                    arr1[j] = -1;
                }
            }
        }

        List<Integer> remaining = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                remaining.add(arr1[i]);
            }
        }
        Collections.sort(remaining);

        list.addAll(remaining);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
