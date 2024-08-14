
import java.util.*;
//*****Atharv Sakhare******//


//Problem Statement:- You need to find whether a given input number is prime or not.
//Input :- Enter the number.
//output:- Output a line containing a string "Yay" or "Nay" for Yes and No respectively.

//Example 1:
//Input:- 36
//output:-"Nay"

//Example 2:
//Input:- 5
//output:-"Yay"

//It reduces the time complexity of our code.
//Hint
/*
Your code counts both i and n/i as divisors when n is divisible by i. 
This is correct because every divisor has a corresponding divisor.
(except when i equals the square root of n, in which case it’s counted only once).
if number have only 2 factors then it is prime else not prime.
*/
public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not:- ");
        int n = scn.nextInt();
        String ans = prime(n);
        System.out.println(ans);
    }
    public static String prime(int n)
    {int count  = 0;
        for(int i = 1;i*i<=n;i++)
        {  
            if(n%i==0)
            {
                if(i == n/i)
                {
                 count = count+1;   
                }
                else
                {
                    count = count+2;  
                }
            }
        }
        if(count  == 2)
        {
            return "Yay";
        }
        else
        {
           return "Nay";
        }
    }
}
//***************************************************************************************************************************************************************

//Brute force solution.
//Below code has more TC
/*
public class Solution
{
    public static void main(String[] args){
        Scanner scn=new Scanner ( System.in);
        System.out.println("Enter the number to check prime or not:- ");
        int n=scn.nextInt();
       boolean ans=prime(n);
        if(ans==true){
            System.out.println("The "+n+" is prime");
        }
        else{
             System.out.println("The "+n+" is not prime");

        }
    }
    public static boolean prime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
            {
                count=count+1;
            }

         }       
          if(count==2)
        {
          return true;
        }
        else{
           return false;
        }
    }
}
*/

//***************************************************************************************************************************************************************
//Another Solution
/*
import java.util.*;
public class primenumber3
{
    public static void main(String[]args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number to check prime or not:- ");
        int n=scn.nextInt();
        boolean ans=prime(n);
        if(ans==true){
            System.out.println("The "+n+" is prime:- ");
        }
        else{
             System.out.println("The "+n+" is not prime:- ");
        }

    }
    public static boolean prime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)  // if any number divides perfectly except 1 and number itself then it is not prime
            {
                return false;
            }
            
      }
      return true;
   }
 
}
*/