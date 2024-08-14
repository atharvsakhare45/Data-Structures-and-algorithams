import java.util.*;
public class solution
{
    public static void main(String [] args)
    {  
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");
        int n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements:- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        shell(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void shell(int arr[],int n)
    {
        
        for(int gap = n/2; gap>=1; gap/=2)
        {
            for(int j=gap;j<n;j++)
            {
                for(int i = j-gap;i>=0;i=i-gap)
                {
                    if(arr[j]>arr[i])
                    {
                        break;
                    }
                    else
                    {   int temp = arr[i+gap];
                         arr[i+gap] = arr[i];
                         arr[i] = temp;
                        //swap(arr[i+gap],arr[i]);
                    }
                }
            }
        }
    }
}