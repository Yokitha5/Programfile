import java.util.*;
//public class hashing {
//    public static void main(String[]  args){
//        HashSet<Integer> h = new HashSet<>();
//        h.add(10);
//        h.add(20);
//        h.add(30);
//        h.add(10);
//        h.remove(20);
//
//        int[] arr = h.stream().mapToInt(Integer::intValue).toArray();
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println(h.contains(10));
//        System.out.println(h.size());
//        System.out.print(h.iterator());
//    }
//}


//public class hashing{
//    public static void main(String[] args){
//        String s= "i am a ece student";
//        HashMap<Character,Integer> h = new HashMap<>();
//        for(int i=0;i<s.length();i++){
//            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
//        }
//        h.replace('t',8);
//        System.out.println(h);
//        System.out.println(h.get('t'));
////        System.out.print(h.Values());
////        System.out.print(h.keySet());
//
//    }
//}


//public class hashing{
//    public static void main(String[] args){
//        HashMap<Integer,Integer> h = new HashMap<>();
//        int arr[]={1,2,3,4,5};
//        int t=9;
//        for(int i=0;i<arr.length;i++){
//            int complement = t-arr[i];
//            if(h.containsKey(complement)){
//                System.out.print(h.get(complement)+" "+i);
//            }
//            h.put(arr[i],i);
//        }
//    }
//}

//public class hashing{
//    public static void main(String[] args){
//        int arr1[]={11,1,13,21,3,7};
//        int arr2[]={11,3,7,1};
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<arr1.length;i++){
//            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
//        }
//        for(int i=0;i<arr2.length;i++){
//            if(!map.containsKey(arr2[i])){
//                System.out.print("false");
//                return;
//            }
//        }
//        System.out.print("true");
//        System.out.print(map);
//    }
//}


//import java.util.*;
//
//public class TransformString {
//    static int minOperations(String A, String B) {
//        if (A.length() != B.length())
//            return -1;
//        int n = A.length();
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            map.put(A.charAt(i), map.getOrDefault(A.charAt(i), 0) + 1);
//            map.put(B.charAt(i), map.getOrDefault(B.charAt(i), 0) - 1);
//        }
//        for (int val : map.values()) {
//            if (val != 0)
//                return -1;
//        }
//        int i = n - 1;
//        int j = n - 1;
//        int operations = 0;
//        while (i >= 0) {
//            if (A.charAt(i) == B.charAt(j)) {
//                i--;
//                j--;
//            }
//            else {
//                i--;
//                operations++;
//            }
//        }
//        return operations;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String A = sc.next();
//        String B = sc.next();
//        int result = minOperations(A, B);
//        if (result == -1)
//            System.out.println("Not Possible");
//        else
//            System.out.println("Minimum Operations: " + result);
//    }
//}
//}


import java.util.HashSet;
import java.util.Set;

public class hashing {
    public static void main(String[] args) {
        String input = "abcd";
        int result = count(input);
        System.out.println(result);
    }
    public static int count(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        Set<String> uniqueSubstrings = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                uniqueSubstrings.add(sub);
            }
        }

        return uniqueSubstrings.size();
    }
}