package com.Trailblazer.Algorithms.Arrays;

import java.util.Arrays;

public class ArrayUtil {
    public  void printArray(int[] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public  void arrayDemo (){
        int[] myArray = new int[5];
        printArray(myArray);
    }
    public static void main(String[] args){
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.arrayDemo();

        int[] allNumber={3,2,4,7,10,6,5};
        int oddNo=0;

        for(int i=0;i<allNumber.length;i++){
            if(allNumber[i]%2 !=0){
                oddNo++;
            }
            System.out.println("index"+i);
        }
        int[]  oddNumber=new int[oddNo];
        int in=0;
        for(int j=0;j<allNumber.length;j++){
            if(allNumber[j]%2 !=0){
               oddNumber[in] =allNumber[j];
               in++;
            }

        }
        System.out.println(Arrays.toString(oddNumber));
    }
}
