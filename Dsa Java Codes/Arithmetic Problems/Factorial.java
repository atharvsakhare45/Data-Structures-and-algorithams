import java.util.*;
///*****Atharv Sakhare******//

/*Problem Statement:- Take as input a number n.  
calculate the factoril of number ex 5 -5*4*3*2*1 =120  
//Input :- Integer
//output:- Integer

//Example 1:
//Input:- 5
//output:-120

//Example 2:
//Input:- 4
//output:- 24

*/

public class solution
{
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
         System.out.println("Enter the Number to calculate factorial:- ");
        int n=scn.nextInt();
        int ans=1;
        for(int i = 1; i <= n; i++)
        {
            ans=ans*i;
        }
        System.out.print("The factorial of "+n+" is "+ans);
    }
}