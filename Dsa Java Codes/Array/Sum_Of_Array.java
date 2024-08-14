import java.util.*;
 ///*****Atharv Sakhare******//

/*Problem Statement:-Given n length Array, You have to return sum of all the elements.

//Input :-Each of the test cases have 2 lines.
First Line contains the size of the array n, while the second contains the n elements of the array.
//output:-  Return an integer which is sum of all the array elements.

//Example 1:
//Input:- 5
          10 2 31 6 1
//output:- 50

*/

public class solution 
{
    public static void main(String[]args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");

        int n=scn.nextInt();  //taking the size of an array.
        System.out.println("Enter the "+ n +" array elements:- ");
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int ans=sum(arr,n);
        System.out.print("The sum of array is:- "+ans);
    }
    public static int sum(int arr[],int n)
    {
    int sum=0;
        for(int i=0;i<n;i++)
        {
          sum=sum+arr[i];
        }
        return sum;

}
}


