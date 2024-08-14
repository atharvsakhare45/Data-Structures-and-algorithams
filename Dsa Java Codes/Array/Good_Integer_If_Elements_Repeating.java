import java.util.*;
//*****Atharv Sakhare******//

/*Problem Statement:-Given arr[n] calculate no of good integer an elements is said to be good if {No of elements <elements == elements itself}
//Input :- Array Size and Array Elements
//output:- number of Good Integers

//Example 1:
//Input:- 6   -1 -4 3 9 -15 7
//output:- 1

//Example 2:
//Input:-  13 -4 -4 2 2 5 5 5 5 8 8 8 10 17
//output:- 5

*/
public class solution
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);

        System.out.println("Enter the size of an array:- ");
        int n = scn.nextInt(); 

        System.out.println("Enter the array elements:- ");
        int arr[] = new int [n];

        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int ans = goodinteger(arr,n);
        System.out.println("Total number of good integr is:- "+ans);

    }
    public static int goodinteger(int arr[],int n)
    {
        Arrays.sort(arr);
        int count = 0;
         
        if(arr[0] == 0)
        {
            count++;
        }
        int lesscount = 0;

        for(int i=1; i<n; i++)
        {
            if(arr[i] != arr[i-1])
            {
              lesscount = i;
            }
            if(arr[i] == lesscount)
            {
                count++;
            }
        }
        return count;
    }
}