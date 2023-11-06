package org.CoreJava.Strings;

import java.util.*;

public class PrintEvenWords {

    public static void main(String[] args) {

        /*1. Print Even length Words
        String s = " I am loving saurabh";
        String[] words = s.split(" ");
        for (String word: words){
            if (word.length() %2 == 0){
                System.out.println(word);
            }
        }*/

        /*2. Add a new string into a string
        String s1 = "GeeksGeeks";
        String s2 = "For";
        int i = 4;
        String s3 = s1.substring(0,i+1) + s2 + s1.substring(i+1);
        System.out.println(s3);*/


        /*3. Palindrome
        String s = "NitiN";
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println(s.charAt(i));
                System.out.println("No");
            }
            i++;
            j--;
        }
        System.out.println("Yes");*/

        //4. Reverse a String

        /*String s = "ABCD";
        StringBuffer s1 = new StringBuffer() ;
        for (int i = s.length()-1; i >= 0 ;i--){
            s1.append(s.charAt(i));
        }
        System.out.println(s1);*/

        /*String s = "ABCD", s2 = "";
        char c;
        for (int i = 0; i <= s.length()-1 ;i++){
            c = s.charAt(i);
            s2 = c+s2;
        }
        System.out.println(s2);*/

        //5. Sort a String

        /*String s = "saurabh";
        char s2[] = s.toCharArray();
        Arrays.sort(s2);
        System.out.println(new String(s2));*/

        //6. Compare two strings

        /*String s1 = "Aakash";
        String s2 = "Saurabh";
        System.out.println(s1.compareToIgnoreCase(s2));*/

        //7. Remove leading Zeros
        String s = "00000123569";
        String s2 = "";
        for(int i = 0; i<= s.length()-1; i++){
            //System.out.println(s.charAt(i));
            if (s.charAt(i) != '0'){
                s2 = s.substring(i);
                break;
            }
        }
        System.out.println(s2);

    }
}
