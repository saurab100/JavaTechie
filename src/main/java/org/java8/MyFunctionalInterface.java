package org.java8;

// A functional interface will have only one abstract method and multiple static and default methods
@FunctionalInterface
public interface MyFunctionalInterface {

    void m1();

    default void m2(){
        System.out.println("Hello from default");
    }

    static void m3(){
        System.out.println("Hello from Static");
    }
}
