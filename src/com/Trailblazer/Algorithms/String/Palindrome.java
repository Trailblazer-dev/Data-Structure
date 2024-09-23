package com.Trailblazer.Algorithms.String;

/**
 * A palindrome is a string when we reverse it and compare it
 * with the original string both are the same
 * eg. madam,wow
 */
public class Palindrome {
    public  boolean isPalindrome(String word){
        char[] charArray= word.toCharArray();
        int start=0;
        int end= word.length()-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word="wow";
        Palindrome verifying = new Palindrome();
        if(verifying.isPalindrome(word)){
            System.out.println("The string is palindrome!!!");
        }
        else{
            System.out.println("The string is not palindrome");
        }
    }
}
