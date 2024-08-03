import java.util.*;
//*****Atharv Sakhare******//

/*Problem Statement:- Write the program to calculate the square of number. 

//Input :- Integer
//output:- Integer

//Example 1:
//Input:- 25
//output:-5

//Example 2:
//Input:- 24
//output:- 4
*/
public class solution
{
    public static void main(String[]args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number to find square root:- ");
        int n=scn.nextInt();
        int ans=root(n);
        System.out.print("The square root of "+n+" is:- "+ans);
    }
    public static int root(int b)
    {
        int ans=0;
        for(int i=0;i*i<=b;i++)
        {
           ans=i;
        }
        return ans;
    }

}