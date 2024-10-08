// leeatcode 162

//https://leetcode.com/problems/find-peak-element/
/*
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.*/

/*
Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
*/
 import java.util.*;
 public class peekelement
 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the size of an array:- ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array elements:- ");

        for(int i=0;i<n;i++)
        {
          arr[i] = scn.nextInt();
        }

        int ans = peak(arr,n);

        System.out.println("the index of peak value is  "+ans);
    }

    public static int peak(int arr[],int n)
    {
        int sp = 0;
        int ep = arr.length - 1;
        while(sp < ep)
        {    int mid = (sp + ep) / 2;
            if(arr[mid] > arr[mid + 1])
            {
                ep = mid;
            }
            else
            {
                sp = mid+1;
            }

        }
        return sp;

    }


 }