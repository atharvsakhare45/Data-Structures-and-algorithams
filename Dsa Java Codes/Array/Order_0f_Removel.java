import java.util.*;
//*****Atharv Sakhare******//

/*
Problem Statement:-Given N elements at every step remove an array element cost to remove elements = sum of array elements present 
find min cost to remove all elements.

//Input :- Array Size and Array Elements
//output:- Min cost 

//Example 1:
//Input:- 4   4 6 2 7
//output:- 39

//Example 2:
//Input:-  6  7 7 7 7 7 7 
//output:- 147

**Hint:- First sort the array to getting min cost 

*/
public class solution
{
    public static void main(String []args)
    {
        Scanner scn = new Scanner( System.in );

        System.out.println("Enter the size of an array:- ");
        int n =scn.nextInt();

        int arr[] = new int [n];
        System.out.println("Enter the array elements:- ");

        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr);  

        int ans = order(arr , n);

        System.out.println( "sum is:- "+ ans );

    }
    public static int order(int arr[] , int n)
    {  int ans = 0;

        for(int i = 0; i < n; i++)
        {
            ans = ans + (arr[i] * (n - i));  
        }
        return ans;
    }
}