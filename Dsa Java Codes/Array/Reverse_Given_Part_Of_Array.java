
import java.util.*;
//*****Atharv Sakhare******//

/*
Problem Statement:-Write the program to reverse given part of an array.
//Input :- Array Size and Array Elements Start point and end point
//output:-  Reversed some part of array

//Example 1:
//Input:-5//array size
        1//starting point
        3//end point
         1 2 3 4 5
//output:- 1 4 3 2 5 

Descripton:- In this code we reduce the time complexity of code using swaping of first and last index of an array
 and increase first index and decrease last index till mid of an array.  
 we have taken start and end point to swap some part of array 

*/
public class solution
{
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");
        int n=scn.nextInt();
        System.out.println("Enter the starting point of array to be reverse greater than 0 and less than "+n+" :-");
        int sp=scn.nextInt();
        System.out.println("Enter the end point of array to be reverse less than "+n+":-");
        int ep=scn.nextInt();
        System.out.println("Enter the "+ n +" array elements:- ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        reverse(arr,sp,ep);
        System.out.println("After reverse some part of array is:- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void reverse(int arr[],int p,int e)
    {
        int sp=p;
        int ep=e;
        while(sp<ep)
        {
            int temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }
    }
}
