import java.util.*;
//Write the program to print the pattern  
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  function name : main
//  Descripton :using the nested loop we print the pattern.
//  Input :4
//  Output :
//          **** 
//          **** 
//          **** 
//          **** 
//  Autor :Atharv Sakhare
//  Date :28/06/2024
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class pattern1
{
    public static void main (String [] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Value of n:- ");
        int n=scn.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
              System.out.println(" ");
        }
       
    }
}