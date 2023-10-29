package org.java8;

interface Calculator{
    //void show();
    int subtract(int a, int b);
}
public class CalculatorImpl {

    public static void main(String[] args) {
        /*Calculator calculator = () -> System.out.println("Hello from Lambda Expressions");
        calculator.show();*/
        Calculator calculator = (a, b) -> a - b;
        calculator.subtract(5, 2);
    }
}

//Traditional method
/*
public class CalculatorImpl implements Calculator{

    public static void main(String[] args) {
        new  CalculatorImpl().show();
    }
    @Override
    public void show() {
        System.out.println("Hello from Normal");
    }
}*/
