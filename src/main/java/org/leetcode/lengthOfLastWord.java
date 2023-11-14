package org.leetcode;

public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String newStr = s.trim();
        for (int i = newStr.length() - 1; i >= 0; i--) {
            if (newStr.charAt(i) == ' ') {
                newStr = newStr.substring(i, newStr.length() - 1);
                return newStr.length();
            }
        }
        return newStr.length();
    }
}
