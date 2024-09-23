package com.Trailblazer.Algorithms.Arrays;

public class MaxValue {
    public static int FindingMax(int[] arr){
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("INVALID INPUT");
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main( String [] args){
        int[] values={12,34,2,34,33,1};
        int maxValue = FindingMax(values);
        System.out.println(maxValue);}
}
