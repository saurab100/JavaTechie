package org.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnonymousFunction {

    public void m1(){
        System.out.println("This is a normal method");
    }

//     (){
//        System.out.println("This is a anonymous method");
//    }
     public static void main(String[] args){
        new AnonymousFunction().m1();
     }

    public static void getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> result = new ArrayList<>();

        for (int i=1; i<= s.length()-k; i++){
            result.add(s.substring(i,k));
        }
        System.out.println(result);
        //return smallest + "\n" + largest;
    }

}

//AnonymousFunction: which does not have name