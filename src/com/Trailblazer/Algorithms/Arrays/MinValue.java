package com.Trailblazer.Algorithms.Arrays;

public class MinValue {
    public static int FindMinimum(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String [] args){
        int[] values={5,9,3,15,1,2};
        int minimum = FindMinimum(values);
        System.out.println(minimum);
    }
}
