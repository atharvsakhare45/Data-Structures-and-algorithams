#include <bits/stdc++.h>
using namespace std;
int main()
{ 
int n,k;
cin>>n>>k;

int arr[n];
for(int i=0;i<n;i++)
{
    cin>>arr[i];
}

int p1=0;
int p2=k-1;

int sum=0;
for(int i=0;i<=p2;i++)
{
    sum=sum+arr[i];
}
int min_diff=INT_MAX;
int ans=0;
while(p2<n)
{  
    if(min_diff > sum)
    {
    
     ans=p1;
    }
    
    min_diff=min(min_diff,sum);
    sum=sum-arr[p1];
    p1++;
    p2++;
    sum=sum+arr[p2];
}
cout<<ans+1;
    return 0;
}