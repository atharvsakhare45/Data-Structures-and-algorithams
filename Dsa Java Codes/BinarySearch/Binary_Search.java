import java.util.*;
public class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);

        System.out.println("Enter tha size of an array:- ");
        int n = scn.nextInt();

        int arr[] = new int [n];
        System.out.println("Enter the array elements:- ");
        
        for(int i=0; i<n; i++)
        {
            arr[i]=scn.nextInt();
        }

        System.out.println("Enter tha target value:- ");
        int target = scn.nextInt();

        boolean ans = target(arr,n,target);
        if(ans == true)
        {
            System.out.println("present");
        }
        else
        {
              System.out.println(" not present");
        }

    }
    public static boolean target(int arr[],int n,int target)
    {
        Arrays.sort(arr);

        int sp = 0;
        int ep = n-1;
        

        while(sp<=ep)
        {
            int mid = (sp+ep)/2;

            if(arr[mid] == target)
            {
                return true;
            }
            else if(arr[mid]>target){

                  ep = mid-1;
            }
            else
            {
                sp = mid+1;
            }
        }
        return false;
    }
}