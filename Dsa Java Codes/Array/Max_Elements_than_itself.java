import java.util.*;

//*****Atharv Sakhare******//

/*Problem Statement:-Given arr[n] calculate no of  elements having at leats 1 element greater than itself .
//Input :- Array Size and Array Elements
//output:- total number of elements having at least 1 elements greater than itself .

//Example 1:
//Input:- 5  -4 -3 7 9 3 9 4 
//output:- 5

//Example 2:
//Input:-  5  7 7 7 7 7  
//output:- 0

*/
//optimal solution....{ overall time complexity of your code is O(n).}

public class solution
{
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");
        int n=scn.nextInt();
        System.out.println("Enter the "+ n +" array elements:- ");
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int ans=maxelement(arr,n);
        System.out.print("Total number of elements greater than itself is:- "+ans);
    }
    public static int maxelement(int arr[],int n)
    {
        int big=Integer.MIN_VALUE; // if array element is negetive.(Integer.MIN_VALUE means minus infinity) 
        for(int i=0;i<n;i++){
            if(arr[i]>big)
            {
                big=arr[i];
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==big)  // Counting total number of max elements in an array (Max elements is repeating)
            {
                count++;
            }
        }
        int ans=n-count; //  Subtracting Total number of max elements from the total number in array.
        return ans;

    }
}