import java.util.*;
//*****Atharv Sakhare******//

/*
Problem Statement:- Reverse the given part of queue
Input :- Queue size and queue elements
output:- Reversed Queue

Example 1:
Input:- 5 -size of Queue
        1 2 3 4 5 -Queue elements 
        3 -no of elements to be reversed   
output:-[3, 2, 1, 4, 5]

**hint
First add all elements in stack and then pop from stack and then remove and add n-k elements from queue
*/
public class solution
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);

         System.out.print("Enter the size of queue:- ");

        int n=scn.nextInt();

        System.out.println("Enter the queue elements:- ");

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            queue.add(scn.nextInt());
        } 

        System.out.println("k reverse element:- ");
        int k=scn.nextInt();

        reverse(queue,n,k);

        System.out.println("Elements of queue " + queue);
    }
    public static void reverse( Queue<Integer>queue,int n,int k)
    {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<k;i++)
        {
            st.push(queue.remove());
        }
        for(int i=0;i<k;i++)
        {
            queue.add(st.pop());
        }
        for(int i=0;i<n-k;i++)
        {
           queue.add(queue.remove());
        }
    }

}