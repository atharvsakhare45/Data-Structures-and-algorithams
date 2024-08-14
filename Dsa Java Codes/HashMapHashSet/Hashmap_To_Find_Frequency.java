import java.util.*;
public class hashmaptofindfrequency
{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter size of an array:- ");
        int n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array element:- ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i]))
            {
                int temp=hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        System.out.println("Enter the size of second array to find frequency of elements:- ");
        int m=scn.nextInt();
        System.out.println("Enter the second array elements:- ");
        int queries[]=new int[m];
        for(int i=0;i<m;i++){
            queries[i]=scn.nextInt();
        }
        for(int i=0;i<m)
        {
            if(hm.containsKey(queries[i]))
            {
                System.out.println("The frequency of "+ queries[i]+" is "+hm.get(queries[i]));
            }
            else{
                System.out.println("The frequency of "+ queries[i]+" is 0");
            }
        }

    }
}