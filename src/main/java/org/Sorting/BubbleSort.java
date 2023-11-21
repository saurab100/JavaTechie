package org.Sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[], int n)
    {
        int j = n - 1;
        while(j > 0){
            int i = 0;
            while (i < j){
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                i++;
            }
            j--;
        }
    }
}
