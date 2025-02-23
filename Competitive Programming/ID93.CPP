#include <bits/stdc++.h>
using namespace std;
int main()
{
   int n;
   cin>>n;
   int arr[n];
   
   for(int i=0;i<n;i++)
   {
       cin>>arr[i];
   }
   
  
   int original_one=0;
   
   vector<int> ans(n);
   for(int i=0;i<n;i++)
   {
       
       if(arr[i]==1)
       {
        original_one+=1;
        ans[i]=-1;
        
       }
       else
       {
           ans[i]=1;
       }
   }
     
    int max_sum=ans[0];
    int curr_sum=0;
    for(int i=0;i<n;i++)
    {
        curr_sum+=ans[i];
        if(curr_sum<0)
        {
            curr_sum=0;
        }
        
        max_sum=max(max_sum,curr_sum);
    }
    
    if(original_one==n)
    {
        cout<<n-1;
        return 0;
    }
   cout<<max_sum+original_one;
    return 0;
}