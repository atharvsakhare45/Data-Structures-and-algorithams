import java.util.*;
//*****Atharv Sakhare******//

/*
Problem Statement:- Reverse the given number
Input :- Integer
output:- Reversed Integer

Example 1:
Input:- 365
output:-563

Example 2:
Input:- 1211
output:-1121

 int lastdigit=n%10;
 Gives last digit

 n=n/10;
 removes last digit of given number

*/

public class solution
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner (System.in);
        System.out.println("Enter the number to reverse:- ");
        int n=scn.nextInt();
        if(n<0){
            n=n*-1;
        }
        System.out.println("After reverse number is:- ");
        while(n>0)
        {
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }

    }
}