package org.CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteElementArray {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);

        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        int[] newArray = {1,2,3,4};
        int[] arr = new int[newArray.length-1];
        int index = 0;
        for (int i = 0; i< newArray.length-1;i++){
            if (newArray[i] != 2 ){
                arr[index] = newArray[i];
                index++;
            }
        }
        System.out.println(arr);
    }
}
