import java.util.*;
//Write the program to print the following pattern.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  function name : main
//  Descripton :using the 3 loop we print the pattern.
//  Input : 5 
//  Output : * * * * *
//            * * * *
//             * * *
//              * *
//               *   
//  Autor :Atharv Sakhare
//  Date :29/06/2024
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class pattern9
 {
    public static void main(String[] args) {
     
        Scanner scn=new Scanner(System.in);
         System.out.println("Enter the value of n:- ");
        int n=scn.nextInt();
        int star=n-1;
        int space=0;
        for(int k=0;k<=n;k++)
        {
       
        for(int j=0;j<space;j++)
        {
        System.out.print(" ");
        } 
        for(int i=0;i<=star;i++)
        {
        System.out.print(" "+"*");     
        }
       
        System.out.println();  
        star--;
        space++;
        }
    }
}