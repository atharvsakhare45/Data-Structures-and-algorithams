import java.util.*;

//*****Atharv Sakhare******//

/*Problem Statement:-Given arr[n] find largets elements in array
//Input :- Array Size and Array Elements
//output:- largets element

//Example 1:
//Input:- 5  1 2 5 9 10
//output:- 10

//Example 2:
//Input:-  6  7 7 7 7 7 7 
//output:- 7

*/

//Optimal Solution........{ Overall time complexity is o(n) }.

public class solution
{
    public static void main(String []args)
    {
        Scanner scn=new Scanner (System.in);
         System.out.println("Enter the size of an array:- ");
        int n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the "+ n +" array elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int ans=maxelement(arr,n);
         System.out.print("The maximum element in an array is:- "+ans);
    }
    public static int maxelement(int arr[],int n)
    {
        int max=0;
        for(int i=0;i<n;i++){
            if(max<arr[i])
            {
                max=arr[i];
            }

        }
        return max;
    } 
}

//Brut force Solution{ the total time complexity is  O(n log n) }
/*
public class solution
{
public static void main(String [] args)
{
    Scanner scn=new Scanner (System.in);
         System.out.println("Enter the size of an array:- ");
        int n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the "+ n +" array elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int ans=maxelement(arr,n);
         System.out.print("The maximum element in an array is:- "+ans);
}
public static int maxelement(int arr[],int n)
{
    Arrays.sort(arr);
    return arr[n-1];
}

}
*/