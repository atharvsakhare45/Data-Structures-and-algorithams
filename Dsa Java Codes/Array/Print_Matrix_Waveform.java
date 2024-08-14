import java.util.*;
//*****Atharv Sakhare******//

/*
Problem Statement:-Write the program to print matrix in wave form.

//Input :- Size of row and coloumn and matrix elements 
//output:- Matrix elements in wave form

 Input: 3//row size
        3//column size.
        1 2 3  
        4 5 6
        7 8 9 

 output:123 654 789
*/
public class solution
{
    public static void main(String[]args)
    {
        Scanner scn=new Scanner(System.in);
         System.out.println("Enter the size of rows:- ");
        int n=scn.nextInt();
        System.out.println("Enter the size of coloumn:- ");
        int m=scn.nextInt();
        int arr[][]=new int [n][m];
         System.out.println("Enter the "+n*m+" elements of matrix:- ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();

            }
        }
           System.out.println("Matrix elements in wave form:- ");
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<m;j++){
                    System.out.print(arr[i][j]);
                }
                System.out.print(" ");
            }
            else
            {
                for(int j=m-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]);
                }
                System.out.print(" ");
            }
        }
            
    }
}
