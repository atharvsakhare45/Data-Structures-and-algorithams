import java.util.*;
//*****Atharv Sakhare******//

/*
Problem Statement:-Given arr[n] calculate no of good integer an elements is said to be good if {No of elements <elements == elements itself}
//Input :- Array Size and Array Elements
//output:-  Good Integers

//Example 1:
//Input:- 6   -1 -4 3 9 -15 7
//output:- 1

//Example 2:
//Input:-  13 -4 -4 2 2 5 5 5 5 8 8 8 10 17
//output:- 5

*/
/*
public class solution{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");
        int n=scn.nextInt();
        int arr[]=new int[n];  
        System.out.println("Enter the "+ n +" array elements:- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int ans=goodinteger(arr,n);  
        System.out.print("The total number of good integers are:- "+ans); 
        scn.close();
    }
        public static int goodinteger(int arr[],int n){ 
        int count=0;
        Arrays.sort(arr);  //sorting array
        for(int i=0;i<n;i++)
        {
            if(arr[i]==i) //checking element and no.elements less than itself
            {
                count++; //increasing count variable
            }
        }
        return count;//return count
        

    }
    
}
// Above code Not Workable when elements gets repeated......
*/

public class solution{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");
        int n=scn.nextInt();
        int arr[]=new int[n];  
        System.out.println("Enter the "+ n +" array elements:- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int ans=goodinteger(arr,n);  
        System.out.print("The total number of good integers are:- "+ans); 
        
    }
    public static int goodinteger(int arr[],int n)
    { 
        int count=0;
        Arrays.sort(arr);  //sorting array
        if(arr[0]==0){
            count++;
        }
        int lesscount = 0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1]) //checking the same elements.
            {
                lesscount=i;
            }
            if(arr[i] == lesscount)
            {
                count++;
            }
        }
        return count;//return count
}
}



    
