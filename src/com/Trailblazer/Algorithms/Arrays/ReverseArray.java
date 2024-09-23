package com.Trailblazer.Algorithms.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] numbers,int start,int end){
        while(start<end){
            int temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]= temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(numbers));
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int[] numbers={2,11,5,10,7,8};
        printArray(numbers);
        reverse(numbers,0,numbers.length-1);
    }
}
