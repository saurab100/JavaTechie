package org.CoreJava;

import java.util.*;

public class arrays {
    public static void main(String[] args) {

        //1. Check if a value is present in an Array in Java
       /* Integer arr[] = {1,2,3,4,5};
        boolean test = Arrays.asList(arr).contains(2);
        System.out.println(test);*/

        //2. Find largest in array
        /*Integer arr[] = {-1,-2,8,-5};
        int max = arr[0];

        for (int i = 0; i<=arr.length-1;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);*/

        //3. Sort the Array Elements in Descending Order
        /*Integer arr[] = {1,8,4,5, 2};
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));*/

        //4. Remove duplicates from Sorted Array

        Integer arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        Integer temp[] = new Integer[0];

        for (int i =0; i<= arr.length-1; i++){
            if (arr[i] == arr[i+1]){
                continue;
            }
            else {
                Arrays.asList(temp).add(arr[i]);
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
