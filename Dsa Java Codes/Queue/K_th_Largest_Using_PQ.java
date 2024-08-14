import java.util.*;
public class kthLargestUsingPQ
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the size of an array:- ");
        int n= scn.nextInt();
        System.out.println("Enter the array elements:- ");  
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        System.out.println("Enter kth number you want to find array:- ");
        int k=scn.nextInt();
        int ans=kthlargest(arr,n,k);
        System.out.println("kth largest elemet is:- "+ans);

    }
    public static int kthlargest(int arr[],int n,int k)
    {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            pq.add(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(pq.peek()<arr[i])
            {
                pq.remove();
                pq.add(arr[i]);
            }

        }
        return pq.peek();
    }
}