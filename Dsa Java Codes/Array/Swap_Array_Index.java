import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the array size:- ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements:- ");
        int arr [] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the Firstindex less than "+ n + ":-");
        
        int k = scn.nextInt(); //Taking first index to swap 

        System.out.println("Enter the secondindex less than"+ n + ":-");

        int l = scn.nextInt(); //Taking second index to swap 
         
        int temp = arr[k];
        arr[k] = arr[l];    // Swaping using temp variable
        arr[l] = temp;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}