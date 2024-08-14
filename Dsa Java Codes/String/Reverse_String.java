import java.util.*;
public class reversestring
{
    public static void main(String[]args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the string:- ");
        String st=scn.nextLine();
        char arr[]=st.toCharArray();
        System.out.println("Before reverse string is:- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        reverse(arr);
        System.out.println();
        System.out.println("After reverse string is:- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void reverse(char arr[])
    {
        int sp=0;
        int ep=arr.length-1;
        while(sp<ep){
           char temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }
    }
}