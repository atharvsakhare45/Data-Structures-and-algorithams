import java.util.*;
public class SmallLetterGreaterThanTarget
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);

        System.out.println("Enter the size:- ");
        int n = scn.nextInt();

        char arr[] = new char[n];
        
        System.out.println("Enter the character in increasing order:- ");
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.next().charAt(0);
        }
         System.out.println("Enter the target:- ");
        char target=scn.next().charAt(0);

        char ans=find(arr,n,target);
        System.out.println("Smallest character greater than target: " + ans);
    }
    public static char find(char arr[],int n,char target)
    {
        int sp = 0;
        int ep = n-1;
        while(sp <= ep)
        {
            int mid = (sp + ep)/2;
            if(arr[mid] > target)

            {
                ep = mid-1;
            }
            else
            {
                sp = mid+1;
            }
        }
        return arr[sp%n];
    }
}