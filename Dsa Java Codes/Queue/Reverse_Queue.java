import java.util.*;
public class reversequeue
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the size of an queue:- ");
        int n = scn.nextInt();
        System.out.println("Enter the queue elements:- ");
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            queue.add(scn.nextInt());
        }
        reverse(queue,n);
        System.out.print("Reversed queue is:- "+queue);
    }
    public static void reverse(Queue<Integer>queue,int n)
    {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            st.push(queue.remove());
        }
        while(st.size()!=0)
        {
            queue.add(st.pop());
        }

    }
    
}