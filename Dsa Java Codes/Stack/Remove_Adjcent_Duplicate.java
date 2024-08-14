import java.util.*;
public class RemoveAdjcentDuplicate
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter a string: ");  
        String str= scn.nextLine();
        String ans = remove(str);
        System.out.println("The ans is "+ans); 
    }
    public static String remove(String str)
    {
        Stack<character> st = new Stack<>();
        if(st.size()==0 || st.peek()!=str.CharAt[i] )
        {
            st.push(charAt[i]);
        }
        else{
            st.pop();
            
        }
    }
}