import java.util.*;
//Write the program to print the following pattern.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  function name : main
//  Descripton :using the 3 loop we print the pattern.
//  Input : 5 
//  Output : * 
//          * * 
//         * * * 
//        * * * * 
//       * * * * *  
//  Autor :Atharv Sakhare
//  Date :29/06/2024
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class pattern7
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
          System.out.println("Enter the value of n:- ");
        int n=scn.nextInt();
        int space=n-1;
        int star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++)
            {
                System.out.print(" "+"*");
            }
            star++;
            space--;
            System.out.println(" ");
        }
    }
}