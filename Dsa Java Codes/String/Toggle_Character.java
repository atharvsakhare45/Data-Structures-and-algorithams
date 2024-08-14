import java.util.*;
public class togglecharacter
{
    public static void main(String[]args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the string:- ");
        String st=scn.nextLine();
        char arr[]=st.toCharArray();
        System.out.print("Before toggle string is:- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        toggle(arr);
        System.out.println();
        System.out.print("After toggle string is:- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        }
        public static void toggle(char arr[])
        { for(int i=0;i<arr.length;i++){
            if(arr[i]<=90)
            {
                arr[i]=(char)(arr[i]+32);
            }
            else{
                 arr[i]=(char)(arr[i]-32);
            }
        }
        }
    }
