import java.util.*;
///*****Atharv Sakhare******//

/*Problem Statement:-Find Distinct Element in an array.
//Input :- Array Size and Array Elements
//output:- Number of distinct elements

//Example 1:
//Input:- 5   1 2 3 4 4
//output:-4

//Example 2:
//Input:-  6   1 1 2 2 5 5 
//output:- 3

**Hint 
Using hashset we store only distinct elements duplict elements can not store in hashset

*/
public class solution
{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");
        int n=scn.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int ans=distinct(arr,n);
        System.out.print("The number of distinct elements is :- "+ans);
    }
    public static int distinct(int arr[],int n){
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }
}