
import java.util.*;
//*****Atharv Sakhare******//
// https://leetcode.com/problems/trapping-rain-water/description/ 
/*
Problem Statement:-Given n non-negative integers representing an elevation map where the width of each bar is 1, 
compute how much water it can trap after raining.

//Example 1:
//Input:- 12  2 1 3 2 1 2 4 3 2 1 3 1  
//output:- 8

//Example 2:
//Input:- 7  5 3 2 1 2 4 6 
//output:- 
 */

public class rain_Water {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of elevation map:- ");

        int n = scn.nextInt();

        System.out.println("Enter the " + n + " integers representing an elevation map:- ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();

        }

        int premax[] = new int[n];
        pre_max_element(arr, premax, n);  // for finding max element before i th index.

        int suffmax[] = new int[n];
        post_max_element(arr, suffmax, n);  // for finding max element after i th index.

        int ans = calculate(premax, suffmax, arr, n);   // calculate the ans for i th index.
        System.out.println("It can trap " + ans + " liters of water.");
    }

    public static void pre_max_element(int arr[], int premax[], int n) {
        premax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (premax[i - 1] >= arr[i]) {
                premax[i] = premax[i - 1];
            } else {
                premax[i] = arr[i];
            }
        }
    }

    public static void post_max_element(int arr[], int suffmax[], int n) {
        suffmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (suffmax[i + 1] > arr[i]) {
                suffmax[i] = suffmax[i + 1];
            } else {
                suffmax[i] = arr[i];
            }
        }
    }

    public static int calculate(int premax[], int suffmax[], int arr[], int n) {
        int min;
        int amount = 0;

        for (int i = 0; i < n; i++) {
            int lb = premax[i];
            int rb = suffmax[i];

            if (lb > rb) {   // min from lb and rb
                min = rb;
            } else {
                min = lb;
            }
            amount = amount + (min - arr[i]);  // subtracting the base value from it.
        }
        return amount;
    }
}
