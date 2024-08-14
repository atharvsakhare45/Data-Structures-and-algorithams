
import java.util.*;
//*****Atharv Sakhare******//

/*
Problem Statement:-Given arr[n] elements count number of equilibrium index an index i is said to be equilibrium index if
condition:-
sum of all the elements befor ith index = sum of all elements after the ith index

//Input :- Array Size and Array Elements 
//output:-  Total number of pivot index

//Example 1:
//Input:- 7   -7 1 5 2 -4 3 0
//output:- 2 pivot index

//Example 2:
//Input:- 4  -2 6 3 4
//output:- 1 pivot index 

//Example 3:
//Input:- 5   1 2 3 4 5 
//output:- 0 pivot index
 */
public class Piovt_Index {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");
        int n = scn.nextInt();
        System.out.println("Enter the " + n + " array elements:- ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
      
        int prearray[] = new int[n];

        prefix(arr, prearray, n);
        
        int ans = piovt(prearray, arr, n);
        System.out.println("There are " + ans + " piovt elements:- ");
    }

    public static void prefix(int arr[], int prearray[], int n) {
        prearray[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prearray[i] = prearray[i - 1] + arr[i];  // calculating the prefix array
        }
    }

    public static int piovt(int prearray[], int arr[], int n) {
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            int leftsum = prearray[i - 1];
            int rightsum = prearray[n - 1] - prearray[i];
            if (leftsum == rightsum) {
                ans++;
            }
        }
        if (0 == prearray[n - 1] - prearray[0])// checking the 0 th  element is pivot or not.(left sum of 0th index is zero)
        {
            ans++;
        }
        if (prearray[n - 1] - arr[n - 1] == 0) // checking the n-1 element is pivot or not.(right sum of last element is 0).
        { //if(prearray[n-2] == 0)
            ans++;
        }
        return ans;
    }
}
