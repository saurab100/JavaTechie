package org.CoreJava.Strings;

public class StringReplacement {

    public static String replaceQuestionMarks(String word, String substr) {
        // Convert the word to a character array for easy manipulation.
        char[] result = word.toCharArray();
        int substrPos = 0;

        for (int i = 0; i < word.length(); i++) {
            if (result[i] == '?') {
                // Replace the question mark with the corresponding character from substr.
                result[i] = substr.charAt(substrPos);
                substrPos++;
            } else if (word.substring(i).startsWith(substr)) {
                // If the current substring matches the target substr, return the result.
                return new String(result);
            }
        }

        // If substr cannot be found in the resulting string, return "-1".
        return "-1";
    }

    public static void main(String[] args) {
        // Examples
        System.out.println(replaceQuestionMarks("??c???er", "deciph"));  // Output: "decipher"
        //System.out.println(replaceQuestionMarks("s?f??d?j", "abc"));      // Output: "-1"
    }
}
