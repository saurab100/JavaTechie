package org.CoreJava.Strings;

public class Exercise {

    public static void main(String[] args) {

        //31. Write a Java program to trim leading or trailing whitespace from a given string.
        String s = " w3resource com ";
        System.out.println("Length:" +s.length());
        System.out.println("After trim: "+s.trim().length());

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

    }
}
