package Leetcode.Day03;

public class Day03 {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char [] arr=new char[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0)
                return false;
        }
         return true;

    }
    public static void main(String[] args) {
       String s="anagram";
       String t="nagaram";
        System.out.println(isAnagram(s,t));
    }
}
