import java.util.*;
//*****Atharv Sakhare******//

/*Problem Statement:- Write program to calculate the sum of n numbers using recursion 

//Input :- Integer
//output:- Integer

//Example 1:
//Input:- 5
//output:-15

//Example 2:
//Input:- 10
//output:- 55
*/
public class solution
{
    public static void main(String[] args)
    {   Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n=scn.nextInt();
        int ans=sum(n);
        System.out.println("The sum of "+n+" is:- "+ans);
    }
    public static int sum(int n)
    {
        if(n==1){
            return 1;
        }
        int temp=sum(n-1);
        return temp+n;
    }
}