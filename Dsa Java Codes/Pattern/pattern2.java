import java.util.*;
//Write the program to print the tringle pattern.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  function name : main
//  Descripton :using the nested loop we print the pattern.
//  Input :5
//  Output :* 
//          ** 
//          *** 
//          **** 
//          ***** 
//  Autor :Atharv Sakhare
//  Date :28/06/2024
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class pattern2
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner (System.in);
        System.out.println("Enter the Value of n:- ");
        int n=scn.nextInt();
        int a=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=a;j++){
                System.out.print("*");
                }
                a++;
                System.out.println(" ");
            }
    }
}