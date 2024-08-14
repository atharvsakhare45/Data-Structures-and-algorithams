import java.util.*;
public class FirstndLastPositionOfElement
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);

        System.out.println("Enter the size of an array:- ");
        int n = scn.nextInt();

        System.out.println("Enter the array elements:- ");
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
         System.out.println("Enter the target:- ");
        int target = scn.nextInt();
        int first = -1;
        int last = -1;
        int sp=0;
        int ep=n-1;
        while(sp<=ep)
        {
            int mid = (sp+ep)/2;
            if(arr[mid]==target){
                first=mid;
                ep=mid-1;
            } 
            else if(arr[mid]>target){
                ep=mid-1;
                
            }
            else{
                sp=mid+1;
            }
        }
        sp=0;
        ep=n-1;
        while(sp<=ep)
        {
            int mid = (sp+ep)/2;
            if(arr[mid]==target)
            {
                last=mid;
                sp=mid+1;
            }
            else if(arr[mid]>target)
            {
                ep=mid-1;
            }
            else
            {
                sp=mid+1;
            }
        }
               System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
   