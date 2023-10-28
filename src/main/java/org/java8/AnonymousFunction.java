package org.java8;

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
}

//AnonymousFunction: which does not have name