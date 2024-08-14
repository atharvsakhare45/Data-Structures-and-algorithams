import java.util.*;
public class pairsumusinghashmap
{
    public static void main(String[]args)
    {
        Scanner scn=new Scanner (System.in);
        System.out.println("Enter the size of array:- ");
        int n=scn.nextInt();
        System.out.println("Enter the sum you want to find:- ");
        int k=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements :- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
       boolean ans=pairsum(arr,n,k);
       if(ans==true){
        System.out.println("The sum is present in an array.");
       }
       else{
        System.out.println("The sum is not present in an array.");
       }
    }
    public static boolean pairsum(int arr[],int n,int k)
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                int temp=hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(int i=0;i<n;i++)
        {
            int a=arr[i];
            int b=k-a;
            if(a!=b && hm.containsKey(b))
            {
                return true;
            }
            else if(a==b && hm.get(b)>1)
            {
                return true;
            }

        }
        return false;
    }
}