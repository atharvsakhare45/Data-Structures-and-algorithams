import java.util.*;
//*****Atharv Sakhare******//

/*
Problem Statement:-Given arr[n] elements count number of equilibrium index an index i is said to be equilibrium index if
condition:-
sum of all the elements befor ith index = sum of all elements after the ith index

//Input :- Array Size and Array Elements 
//output:-  Total number of pivot index

//Example 1:
//Input:- 7   -7 1 5 2 -4 3 0
//output:- 2 pivot index

//Example 2:
//Input:- 4  -2 6 3 4
//output:- 1 pivot index 

//Example 3:
//Input:- 5   1 2 3 4 5 
//output:- 0 pivot index
*/

// Brute force Solution
/*
public class solution{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the array size:- ");
        int n = scn.nextInt();

        System.out.println("Enter tha "+n+" array elements:- ");
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int ans = 1;
            for(int j=0;j<n;j++)
            {
                if(arr[i]!=arr[j])
                {
                    ans = ans*arr[j];
                     
                }
               
            }
             System.out.print(ans+" ");
        }

    }
}
*/
public class solution{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the array size:- ");
        int n = scn.nextInt();

        System.out.println("Enter tha "+n+" array elements:- ");
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
         int preproduct[] = new int [n];
         preproduct[0] = arr[0];
         for(int i=1;i<n;i++)
         {
           preproduct[i] = preproduct[i-1]*arr[i];
         }

       int suffix= 1;
       for(int i = n-1;i>0;i--)

       {
          preproduct[i] = preproduct[i-1]*suffix;
          suffix = suffix*arr[i];

       }
       preproduct[0] = suffix;
       for(int i=0;i<n;i++)
       {
        System.out.print(preproduct[i]+" ");
       }

    }
}


