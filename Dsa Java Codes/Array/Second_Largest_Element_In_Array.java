import java.util.*;
//*****Atharv Sakhare******//

/*
Problem Statement:-Write the program to find second largest element in array
//Input :- Array Size and Array Elements
//output:-  second largest element

//Example 1:
//Input:-5  1 2 3 4 5 
//output:- 4

//Example 2:
//Input:-5  1 2 3 5 5 
//output:- 3



*/
/*
1.Brutforce solution(not working if duplict elements are present)
public class solution{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size:- ");
        int n = scn.nextInt();
        System.out.println("Enter the "+n+" array elements:- ");
        int arr[]= new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second largest element is:- "+arr[n-2]);
    }
}
*/
//Above code does not work when elements can repting

public class solution
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size:- ");
        int n = scn.nextInt();
        System.out.println("Enter the "+n+" array elements:- ");
        int arr[]= new int [n];

        for(int i = 0; i < n; i++)
        {
           arr[i]=scn.nextInt();
        }

        int ans = largest(arr,n);
        System.out.println(" Second Largest element is:- "+ ans);
    }
    public static int largest(int arr[],int n)
    {  
        int max = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
               secondlargest = max;
               max = arr[i];
            }
        }
        return secondlargest; 
    }
}

