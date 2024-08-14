import java.util.*;
public class BubbleSort
{
    public static void main(String[]args)
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
        Bubble(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    public static void Bubble(int arr[],n)
    { 
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {  if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
        }
    }
}