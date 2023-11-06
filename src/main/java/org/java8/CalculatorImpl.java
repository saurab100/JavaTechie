package org.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

interface Calculator{
    default void show() {

    }

    int subtract(int a, int b);
}
public class CalculatorImpl{

    public static void main(String[] args) throws ParseException {
        /*Calculator calculator = () -> System.out.println("Hello from Lambda Expressions");
        calculator.show();*/
        Calculator calculator = (a, b) -> a - b;
        calculator.subtract(5, 2);
         LocalDateTime simpleDateFormat = LocalDateTime.now();
        System.out.println(simpleDateFormat.toLocalTime());
        /*int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        try {
            int c = 10/0;
            System.out.println(c);
        }catch ( | ArithmeticException ex){
            ex = null;
            System.out.println(ex);
        }*/

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
