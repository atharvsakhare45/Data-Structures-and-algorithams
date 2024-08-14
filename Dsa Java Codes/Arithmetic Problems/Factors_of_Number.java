
import java.util.*;
//*****Atharv Sakhare******//


//Problem Statement:- You need to find the number of factors of the given required input.
//Input :- Enter the number
//output:- Output a line containing the number of factors.

//Example 1:
//Input:- 36
//output:-9

//It reduces the time complexity of our code.
//Hint
/*
Your code counts both i and n/i as divisors when n is divisible by i. 
This is correct because every divisor has a corresponding divisor.
(except when i equals the square root of n, in which case it’s counted only once).
*/

public class solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the number :- ");
         int n=scn.nextInt();
         
        int ans = fact(n);
        System.out.println(n +" have " + ans +" factors");
        
    }
    public static int fact(int n)
    {  int count  = 0;
     
       for(int i = 1; i * i <= n; i++)
       {
           
        if (n % i == 0)
        {
            if(i == n/i) // In case of square number.
           {
               count  = count+1;
           }
            else
            {
            count = count + 2;
            }
        }
           
       }
     return count;
     
    }
}
//Brute force solution.
//It checks the all numbers.
/*
import java.io.*;
import java.util.*; 
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
         int n=scn.nextInt();
        int ans = fact(n);
        System.out.println(ans);
        
    }
    public static int fact(int n)
    {   int count  = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
     return count;
     
     
    }
    
}
*/