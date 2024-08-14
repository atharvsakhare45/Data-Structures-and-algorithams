import java.util.*;
//*****Atharv Sakhare******//

/*
Problem Statement:-Write the program to reverse an array.
//Input :- Array Size and Array Elements
//output:-  Reversed array

//Example 1:
//Input:-5  1 2 3 4 5 
//output:-  5 4 3 2 1

*/
public class soltion{
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
      System.out.println("Enter the size of an array:- ");
        int n=scn.nextInt();
     System.out.println("Enter the "+ n +" array elements:- ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        reverse(arr,n);
        System.out.println("After reverse array is:- ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void reverse(int arr[],int n)
    {
        int sp=0;
        int ep=n-1;
        while(sp<ep)//till mid of an array.
        {
            int temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }
    }
}