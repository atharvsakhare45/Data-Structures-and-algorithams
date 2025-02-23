#include <bits/stdc++.h>
using namespace std;
int main()
{ 
    int n;
    cin>>n;
    
    int m;
    cin>>m;
   
   vector<int> arr(m);
   
   for(int i=0;i<m;i++)
   {
       cin>>arr[i];
   }
    
    sort(arr.begin(),arr.end());
    
    int p1=0;
    int p2=n-1;
    int min_diff=INT_MAX;
    
    while(p2<m)
    {
       int diff=arr[p2]-arr[p1];
       min_diff=min(min_diff,diff);
        p1++;
       p2++;
    }
   cout<<min_diff;

    return 0;
}