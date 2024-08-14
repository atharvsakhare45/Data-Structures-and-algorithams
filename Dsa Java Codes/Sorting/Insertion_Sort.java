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
        insertion(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertion(int arr[],int n)
    {
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j>0; j--)
            {
                if(arr[j-1] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}