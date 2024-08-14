import java.util.*;
public class solution{
public static void main(String[] args)
{
Scanner scn = new Scanner (System.in);
System.out.println("Enter the array size:- ");
int n = scn.nextInt();
System.out.println("Enter the " + n + " array elements:- ");
int arr[] = new int [n];
for(int i=0;i<n;i++)
{
    arr[i] = scn.nextInt();
}

int prearray[] = new int[n];
prefix_sum(arr,prearray,n);

System.out.println("Enter the first range for sum:- ");
int l = scn.nextInt();

System.out.println("Enter the second range for sum:- ");
int r = scn.nextInt();

int ans = range(prearray,arr,n,r,l);
System.out.println("the sum in range "+l+" to"+r+" is:- "+ans);
}
public static void prefix_sum(int arr[],int prearray[],int n)
{
    prearray[0] = arr[0];
    for(int i = 1; i<n; i++)
    {
        prearray[i] = prearray[i-1] + arr[i];
    }
}
public static int range(int prearray[],int arr[],int n,int r,int l)
{
    int left = l;
    int right = r;
    int ans  = 0 ;
    if(left>0)
    {
         ans = prearray[right] - prearray[left-1];
    }
    else
    {
        ans = prearray[right];
    }
return ans;
}
}
