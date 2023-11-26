package org.CoreJava.Strings;

public class CheckDigitsInAString {
    public static void main(String[] args) {
        String s ="ab5c2d4ef12s";
        char[] c = s.toCharArray();
        int total = 0;
        for (int i =0; i< s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                String temp = s.substring(i,i+1);
                total += Integer.parseInt(temp);
            }
        }
        System.out.println(total);
    }
}
