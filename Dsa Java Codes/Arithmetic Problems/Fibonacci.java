import java.util.*;
//*****Atharv Sakhare******//

/*Problem Statement:- Take as input a number n.  
Print the nth number of Fibonacci sequence where  
0th Fibonacci is 0 and 1st Fibonacci is 1. Here is a sample  
0 1 1 2 3 5 8 13 21 34 55 */
//Input :- Integer
//output:- Integer

//Example 1:
//Input:- 10
//output:-55

//Example 2:
//Input:- 4
//output:- 3 


//Below code is of fibonaci using recursion.
public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner (System.in);

       System.out.println("Enter the number:- ");
        
        int n = scn.nextInt();
        int ans = fib(n); 

        System.out.println(ans);
    }
    public static int fib(int n)
    {
        if(n == 1 || n == 0){
            return n;
        }
            
        int fib1 = fib(n - 1);
        int fib2 = fib(n - 2);
        
        return fib1 + fib2;
    }
}

//***************************************************************************************************************************************************************
//Using array we find fibonnaci
/*
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner (System.in);
        
        int n = scn.nextInt();
        int arr[]  = new int [n+2];
        
        arr[0] = 0;
        arr[1] = 1;
        
        for(int i = 2;i<=n;i++)
        {
            arr[i] = arr[i-1]+arr[i-2];  
        }
        
        System.out.print(arr[n]);
    }
}
*/
//***************************************************************************************************************************************************************