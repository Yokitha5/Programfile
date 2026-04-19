import java.util.*;

class Day3 {

    // 1. Reverse a String
    static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    // 2. Check Anagram
    static boolean isAnagram(String a, String b) {
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    // 3. First Non-Repeating Character
    static char firstUnique(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray())
            freq[c - 'a']++;

        for (char c : s.toCharArray())
            if (freq[c - 'a'] == 1)
                return c;

        return '#';
    }

    // 4. Count Vowels & Consonants
    static void countVC(String s) {
        int v = 0, c = 0;

        for (char ch : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1)
                v++;
            else if (Character.isLetter(ch))
                c++;
        }

        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }

    // 5. Remove Duplicates from String
    static String removeDuplicates(String s) {
        Set<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) set.add(c);

        StringBuilder res = new StringBuilder();
        for (char c : set) res.append(c);

        return res.toString();
    }

    // 6. Toggle Case
    static String toggleCase(String s) {
        StringBuilder res = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                res.append(Character.toLowerCase(c));
            else
                res.append(Character.toUpperCase(c));
        }
        return res.toString();
    }

    // 7. Check Pangram
    static boolean isPangram(String s) {
        boolean[] seen = new boolean[26];

        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z')
                seen[c - 'a'] = true;
        }

        for (boolean b : seen)
            if (!b) return false;

        return true;
    }

    // 8. Pattern Printing (Right Triangle)
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 9. Second Largest Element
    static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }

    // 10. Check Sorted Array
    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1])
                return false;

        return true;
    }

    public static void main(String[] args) {

        System.out.println("Reverse: " + reverseString("hello"));

        System.out.println("Anagram: " + isAnagram("listen", "silent"));

        System.out.println("First Unique: " + firstUnique("aabbcde"));

        countVC("Hello World");

        System.out.println("Remove Duplicates: " + removeDuplicates("programming"));

        System.out.println("Toggle Case: " + toggleCase("HeLLo"));

        System.out.println("Pangram: " + isPangram("the quick brown fox jumps over a lazy dog"));

        System.out.println("Pattern:");
        pattern(4);

        int[] arr = {10, 20, 5, 8, 30};
        System.out.println("Second Largest: " + secondLargest(arr));

        int[] sorted = {1, 2, 3, 4};
        System.out.println("Is Sorted: " + isSorted(sorted));
    }
}
