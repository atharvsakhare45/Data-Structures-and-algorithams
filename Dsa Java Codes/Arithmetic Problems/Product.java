import java.util.*;
//*****Atharv Sakhare******//

// Problem statement 1 : Write the program to calculate the product of two numbers.

//Example 1:
//Input:- 3 5
//output:-15

//Example 2:
//Input:- 5 9
//output:-45

public class solution
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int n=scn.nextInt();
        System.out.print("Enter first number:- ");
        int r=scn.nextInt();
        int ans=product(n,r);
        System.out.print("The product of "+n+" and "+r+" is:- "+ans);
    }
    public static int product(int x,int y)
    {
       int a=x*y;
        return a;
    }
}