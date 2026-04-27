// 1.Longest Common Prefix
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        String pf = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(pf) != 0){
                pf=pf.substring(0,pf.length()-1);
                if(pf.isEmpty()){
                    return "";
                }

            }
        }
        return pf;
    }
}

// 2.Assign Cookies
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                i++;
            }
            j++;
        }
        return i;
    }
}


// 3.Valid Palindrome
class Solution {
    public boolean isPalindrome(String s) {
        String w = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String s1 ="";
        for(int i = w.length()-1;i>=0;i--){

            s1+=w.charAt(i);
        }
        if(s1.equals(w)){
            return true;
        }
        else{
            return false;
        }
    }
}


// 4. Longest Substring Without Repeating Characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l=0,max=0;
        String longest="";
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            if(i-l+1>max){
                max = i-l+1;
                longest= s.substring(l,i+1);
            }
        }
        return longest.length();
    }
}
