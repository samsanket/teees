package leet;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {

        String s="rat";
        String t="car";

        System.out.println(checkValidAagram(s,t));
    }

    public  static boolean checkValidAagram(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }

        // Use HashMaps to count the occurrences of characters
        Map<Character, Integer> charCountS = new HashMap<>();
        Map<Character, Integer> charCountT = new HashMap<>();

        // Increment counts for characters in string s
        for (char c : s.toCharArray()) {
            charCountS.put(c, charCountS.getOrDefault(c, 0) + 1);
//            xFreq.put(w,xFreq.getOrDefault(w,0)+1);

        }

        // Increment counts for characters in string t
        for (char c : t.toCharArray()) {
            charCountT.put(c, charCountT.getOrDefault(c, 0) + 1);
        }

        // Compare the counts in the two HashMaps
        return charCountS.equals(charCountT);
    }
}
