import java.util.*;
//*****Atharv Sakhare******//

/*Problem Statement:-First non repeating element in array.
//Input :- Array Size and Array Elements
//output:- First non repeating element

//Example 1:
//Input:- 5   1 2 3 4 4
//output:- 1

//Example 2:
//Input:-  6   1 1 2 2 3 5 
//output:- 3

*/
public class solution
{
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");
        int n=scn.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        HashMap<Integer,Integer>hm=new HashMap<>();  // created hashmap of key value of type integer.

        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                int temp = hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }
            else{
                hm.put(arr[i],1);
            }

        }
        
        for(int i:arr){
            
            if(hm.get(i)==1)
            {
                System.out.println("First non repeating element is:- "+ i);
                break;
            }

    }
}
}