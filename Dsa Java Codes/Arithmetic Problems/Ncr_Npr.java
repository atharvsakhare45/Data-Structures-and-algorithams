import java.util.*;
//*****Atharv Sakhare******//


//Problem Statement:- Take as input
//1. first number: n
//2. second number: r

//Input :- Integer representing n
//         Integer representing r

//output:- "Integer representing n!"
//         "Integer representing npr"
//         "Integer representing ncr"

//Example 1:
//Input:- 5
//        3  

//output:-120
//        60
//        10


import java.util.*;

public class Solution {

    public static void main(String[] args) {
 
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value of n:- ");
        int n=scn.nextInt();
        System.out.println("Enter the value of r:- ");
        int r=scn.nextInt();
        int nfact=fact(n);
        int rfact=fact(r);
        
        int nmrfact=fact(n-r);
        System.out.println(nfact);
        
        int ans2=nfact/nmrfact;
        System.out.println(ans2);
        
        int ans=nfact/(nmrfact*rfact);
        System.out.println(ans);    
    }
        public static int fact(int w)
        {
               int value=1;
                for(int i=1;i<=w;i++)
                {
                    value=value*i;
                    
                }
            return value;
        }
}