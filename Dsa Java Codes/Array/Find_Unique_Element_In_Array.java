import java.util.*;
/*
public class solution{
    public static void main(String[] args)
    {
         Scanner scn =  new Scanner (System.in);
        System.out.println("enter the the size of an array:- ");
        int n = scn.nextInt();
        System.out.println("Enter the " + n + " array elements:- ");
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hs.add(arr[i]);
        }
        System.out.println("There are " +hs.size()+ " unique elements in array.");
    }
}
*/
/*
public class solution{
    public static void main(String[] args)
    {
         Scanner scn =  new Scanner (System.in);
        System.out.println("enter the the size of an array:- ");
        int n = scn.nextInt();
        System.out.println("Enter the " + n + " array elements:- ");
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int ans = arr[0];
        int count = 1;
          for(int i=1;i<n;i++)
          {
            if(ans == arr[i])
            {
               ans = arr[i];
            }
            else
            {
                 ans = arr[i];
                 count++;
            }

          }
          System.out.println("There are "+ count + " unique elements in array.");

    }
}
*/
public class solution{
    public static void main(String[] args)
    {
         Scanner scn =  new Scanner (System.in);
        System.out.println("enter the the size of an array:- ");
        int n = scn.nextInt();
        System.out.println("Enter the " + n + " array elements:- ");
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(arr[j]!= arr[i])
            {
                arr[i+1]= arr[j];
                i++;
            }
        }
System.out.println("there are "+arr.length+" unique elements in array");
    }
}










