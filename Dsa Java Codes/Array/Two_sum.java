import java.util.*;
public class twosum
{
    public static void main(String[]args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the size of an array:- ");
        int n=scn.nextInt();

        System.out.print("Enter the sum of two numbers which you want to find in array:- ");
        int k=scn.nextInt();
        
        System.out.println("Enter the "+n+" array elements:- ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
    boolean ans=twosum(arr,n,k);
    if(ans==true){
        System.out.print("The sum of two numbers "+k+" is present in array.");
    }
    else{
        System.out.print("The sum of two numbers "+k+" is not present in array");
    }
    }
    public static boolean twosum(int arr[],int n,int k)
    {
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==k)
            {
                return true;
            }
        }
       }
       return false;
       
    }
}