import java.util.*;
/*
//Brute Force Solution....{T.c is n^2}...so not optimal solution

public class solution{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the size of array:- ");
        int n = scn.nextInt();
        System.out.println("Enter the "+n+" array elements:- ");
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();

        }
       // int prearray[] = new int [n];
       
       for(int i=0;i<n;i++)
       {   
         int sum =0;
        for(int j=0;j<=i;j++)
        {
             sum = sum + arr[j];
        }
        System.out.print(sum + " ");
       }
    }
}

*/
/*
public class solution{

public static void main(String [] args)
    {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the size of array:- ");
        int n = scn.nextInt();
        System.out.println("Enter the "+n+" array elements:- ");
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum  = sum + arr[i];
           System.out.print(sum +" ");
        }
    }
}
*/

public class solution {
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int n = scn.nextInt();
        int arr [] = new int [n];
        System.out.println("Enter the "+n+" array elements:- ");
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        int prearray[] = new int [n];
        prefix_sum(arr, prearray, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(prearray[i]+" ");
        }
    }
public static void prefix_sum(int arr[],int prearray[],int n)  // Void do not have return type
{
        prearray[0] = arr[0]; 
        for(int i=1;i<n;i++)
        {
           prearray[i] = prearray[i-1] + arr[i];
        }
}
}