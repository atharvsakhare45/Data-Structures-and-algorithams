#include <iostream>
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
    
    int min_ele=arr[0];
    int max_ele=arr[0];
    
    for(int i=0;i<n;i++)
    {
        if(arr[i] > max_ele)
        {
            max_ele=arr[i];
        }
        if(arr[i] < min_ele)
        {
            min_ele=arr[i];
        }
    }
    int min_pos=-1;
    int max_pos=-1;
    for(int i=0;i<n;i++)
    {
       if(arr[i]==min_ele)
       {
           min_pos=i;
       }
    }
    
    for(int i=n-1;i>=0;i--)
    {
        if(arr[i]==max_ele)
        {
            max_pos=i;
        }
    }
     int ans=0;
    if(min_pos < max_pos)
    {
       ans=((n-1)-min_pos)+ max_pos-1;
    }
    else
    {
        ans=((n-1)-min_pos)+ max_pos;
    }
    
    cout<<ans;

    return 0;
}