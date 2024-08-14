import java.util.*;
class MedianOfArray
{
     PriorityQueue<Integer>large;
        PriorityQueue<Integer>small;
        public MedianOfArray
        {
          large = new PriorityQueue<>();
          small = new PriorityQueue<>(Collections.reverseOrder());
        }
         public void addnum(int num)
         {
            if(small.size()==large.size())
            {
                large.add(num);
                small.add(large.remove());
            }
            else{
                small.add(num);
                large.add(small.remove());
            }
        }
        public double findmedian()
        {
            if(small.size()==large.size())
            {
         return (small.peek()+large.peek())/2.0;
            }
            else{
            return small.peek();
            }
        }
    
}        
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the array size:- ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements:- ");
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        MedianOfArray medianobj = new MedianOfArray();
        for (int i = 0; i < n; i++) 
        {
            medianObj.addnum(arr[i]);
        }
        double ans = medianObj.findmedian();
        System.out.println("The median is: " + ans);        
    }