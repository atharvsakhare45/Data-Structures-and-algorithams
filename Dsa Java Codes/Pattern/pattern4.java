import java.util.*;

//Write the program to print the following pattern.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  function name : main
//  Descripton :using the 4 loop we print the pattern.
//  Input :5 only odd input is valid 
//  Output :  ***-***
//            **---**
//            *-----*
//            **---**
//            ***-***
//  Autor :Atharv Sakhare
//  Date :28/06/2024
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class pattern4
{
    public static void main(String[] args )
    {
        Scanner scn=new Scanner (System.in);
          System.out.println("Enter the only odd value of n:- ");
        int n=scn.nextInt();
        int space=1;
        int star=n/2+1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=star;j++){
                System.out.print("*");

            }
            for(int k=1;k<=space;k++){
                System.out.print("-");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if(i<=n/2){
                space=space+2;
                star--;
            }
            else{
                space=space-2;
                star++;
            }
            System.out.println("");//for next line

        }


    }
}