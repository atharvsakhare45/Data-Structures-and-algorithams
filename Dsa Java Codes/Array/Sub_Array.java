
import java.util.*;

/*
public class Sub_Array {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size:- ");
        int n = scn.nextInt();

        System.out.println("Enter tha " + n + " array elements:- ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the start point");
        int s = scn.nextInt();
        System.out.println("Enter the end point");
        int e = scn.nextInt();
          for(int j=s;j<=e;j++){
            for (int i=s;i<=e;i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.print(" ");
              s++;
          }
    }
}
*/
public class Sub_Array {

    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size:- ");
        int n = scn.nextInt();

        System.out.println("Enter tha " + n + " array elements:- ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for(int s=0;s<n;s++)
        {
            for(int e=s;e<n;e++)
            {
                for(int i=s;i<=e;i++)
                {
                    System.out.print(arr[i]+ " ");
                }
                System.out.print(" ");

            }
        }
        
        }
}
