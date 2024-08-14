// leetcode 852

import java.util.*;
//leetcode.com/problems/peak-index-in-a-mountain-array/    
/*
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.
*/

/*
Example 1:

Input: arr = [0,1,0]

Output: 1

Example 2:

Input: arr = [0,2,1,0]

Output: 1

Example 3:

Input: arr = [0,10,5,2]

Output: 1
*/
public class MoutainInArray
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the size of an array:- ");
		int n = scn.nextInt();

		int arr[] = new int [n];
		System.out.println("Enter array elements:- ");
		for(int i=0; i<n; i++)
		{
			arr[i] = scn.nextInt();
		}
		int ans = moutain(arr,n);
		System.out.println("The moutain value in an array is:- " +ans);

	}
	public static int moutain(int arr[],int n)
	{
		int sp = 0;
		int ep = n - 1;
		int mid = 0;
		while(sp < ep)
		{
			 mid = (sp + ep) / 2;
		    if(arr[mid] > arr[mid + 1])
			{
				ep = mid;
			}
			else{
				sp = mid + 1;
			}	
		}
		return arr[sp];
	}
}