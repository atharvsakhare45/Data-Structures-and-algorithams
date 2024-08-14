
import java.util.*;
//*****Atharv Sakhare******//

/*
Problem Statement:-Write the program to rotate the array by k times.
//Input :- Array Size and Array Elements and k value 
//output:-  K times reversed array 

//Example 1:
//Input:-7//array size
         3//how many times array will be rotated
         3 -2 1 4 6 9 8 //array elements
//output:- 6 9 8 3 -2 1 4

Descripton:-This question is very important Question Askesd by many compines int this question we have rotate array by k times.
             if rotation is greater than the array size then it rotation is equal to k=k%n.
             in this code we reverse the array 3 times using three function.
             0 to n-1
             0 to k-1  first part of array.
            k to n-1 second part of array. 

*/
public class solution
{
    public static void main(String[]args)
    {
        Scanner scn=new Scanner (System.in);
        System.out.println("Enter the size of an array:- ");
        int n=scn.nextInt();

        System.out.println("Enter the value of rotation:- ");
        int k=scn.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the "+ n +" array elements:- ");

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
         System.out.println("After "+ k +" rotation array is:- ");   
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }


    
    public static void reverse(int arr[],int s,int e)
    {
        int sp=s;
        int ep=e;
        while(sp<ep){
        int temp=arr[sp];
        arr[sp]=arr[ep];
        arr[ep]=temp;
        sp++;
        ep--;
        }
    }
}
