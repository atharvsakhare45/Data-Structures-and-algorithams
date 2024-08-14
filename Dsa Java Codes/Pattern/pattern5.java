import java.util.*;
//Write the program to print the number pattern.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  function name : main
//  Descripton :using the nested loop we print the pattern.
//  Input :4
//  Output :1  
//          2 3  
//          4 5 6  
//          7 8 9 10  
//  Autor :Atharv Sakhare
//  Date :28/06/2024
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class pattern2
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner (System.in);
          System.out.println("Enter the value of n:- ");
        int n=scn.nextInt();
        int a=1;
        int num=1;
        for(int i=1;i<=n;i++)
        {
             for(int j=1;j<=a;j++)
            {
                System.out.print(num+" ");
                num++;
            }
                a++;
               System.out.println(" ");
        }
    }
}