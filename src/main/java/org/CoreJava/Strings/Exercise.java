package org.CoreJava.Strings;

public class Exercise {

    public static void main(String[] args) {
        String s = "w3resource.com";
        String x = "";
        StringBuilder s2 = new StringBuilder();
        char[] ch = s.toCharArray();
        for(int i = 0 ; i<= s.length()-1; i++){
            if(i%2 == 0){
                x += s.charAt(i);
            }
        }
        for (char c: ch){
            if(c != 'w'){
                s2.append(c);
            }
        }
        System.out.println(x);
        System.out.println(s2.toString());
    }
}
