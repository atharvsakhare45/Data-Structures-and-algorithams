import java.util.*;
public class solution{
    public static void main(String[] args)
    {
        
        Scanner scn =  new Scanner (System.in);
        System.out.println("enter the the size of an array:- ");
        int n = scn.nextInt();
        System.out.println("Enter the " + n + "array elements:- ");
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int ans = arr[0];
        int count = 1;
        for(int i=1;i<n;i++)
        {
            
           if(arr[i-1]<=arr[i])
           {
            //arr[i-1] = arr[i];
            count++;
           }    
        }
        if(count==n)
        {
            System.out.println("Array is Sorted.");
        }
        else{
            System.out.println("Array is Not Sorted.");
        }
    }
}
