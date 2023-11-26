package org.CoreJava.Strings;

//How do you reverse a given string in place?
public class ReverseString {

    public static void main(String[] args) {
        String s = "Saurabh";
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        System.out.println(arr);
    }


    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

}
