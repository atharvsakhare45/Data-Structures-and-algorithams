import java.util.*;
///*****Atharv Sakhare******//

/*Problem Statement:- Find the number is odd or Even.
//Input :- Integer 
//output:- "Even" or "Odd"

//Example 1:
//Input:- 5
//output:- Odd.

//Example 2:
//Input:- 4
//output:- Even. 

*/
public class solution{

    public static void main(String A[])
    {
        System.out.println("Enter the Number:- ");

        Scanner scn=new Scanner (System.in);

        int n=scn.nextInt();

        if(n % 2 == 0)
        {
            System.out.println("Even");
        }

        else
        {
            System.out.println("Odd");
        }

    }
}


//Using Bit wise operator we can find even or odd number.
/*

import java.util.*;
public class evenodd1
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number to check even or odd:- ");
        int n=scn.nextInt();

        if((n & 1)==0)
        {
            System.out.println("Even");
        }
        
        else
        {
             System.out.println("Odd");
        }


    }
}

*/
