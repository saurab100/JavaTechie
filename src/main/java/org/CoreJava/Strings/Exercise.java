package org.CoreJava.Strings;

public class Exercise {

    public static void main(String[] args) {

        //38. Write a Java program to print the result of removing duplicates from a given string.
        String s1 = "saaurabhb";
        char[] ch = s1.toCharArray();
        String duplicates = "";
        for(char c: ch){
            if (duplicates.indexOf(c) == -1){
                duplicates += c;
            }
        }
        System.out.println(duplicates);

        //39. Write a Java program to find the first non-repeating character in a string.

        //43. Write a Java program to find the character in a string that occurs the most frequently.
        String s2 = "ssauraabh";
        int[] x = new int[256];
        for(int i = 0; i<= s2.length()-1; i++){
            x[s2.charAt(i)]++;
        }
        int max = -1;
        char result = ' ';
        for(int i = 0; i <= s2.length()-1; i++){
            if(max < x[s2.charAt(i)]){
                max = x[s2.charAt(i)];
                result = s2.charAt(i);
            }
        }
        System.out.println(result);
    }
}
