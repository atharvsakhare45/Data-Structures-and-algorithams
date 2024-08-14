import java.util.*;
public class solution{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int b= scn.nextInt();
        int ans = 0;
        int i=1;
        while(i<=n&&i<=b)
        {
            if(n%i==0 && b%i==0)
            {
                
                ans = i;
            }
            i++;
        }
        System.out.println(ans);
    }
}