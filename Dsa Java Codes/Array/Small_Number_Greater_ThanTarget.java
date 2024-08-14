import java.util.*;
public class solution
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        
        System.out.println("Enter the size of an array:- ");
        int n = scn.nextInt();

        System.out.println("Enter the array elements:- ");
        int arr[] = new int [n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the target:- ");
        int target = scn.nextInt();

        int ans = find(arr,n,target);
        System.out.println("Smallest element greater than target: " + ans);

    }
    public static int find(int arr[], int n, int target)
    {   
        Arrays.sort(arr);
        int sp = 0;
        int ep = n - 1;
        while(sp<=ep)
        {
            int mid = sp + (ep - sp) / 2;
            if(arr[mid] > target)
            {
                ep = mid - 1;
            }
            else
            {
                sp = mid + 1;
            }
        }
        return arr[sp % n];

    }
} 